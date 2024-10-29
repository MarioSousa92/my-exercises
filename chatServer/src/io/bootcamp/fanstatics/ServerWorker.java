package io.bootcamp.fanstatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ServerWorker implements Runnable {

    private final Server server;
    private final Socket clientSocket;
    private OutputStream outputStream;

    private String clientName;

    public ServerWorker(Server server, Socket clientSocket) {
        this.server = server;
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            this.outputStream = clientSocket.getOutputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            outputStream.write("Client name: ".getBytes());
            outputStream.flush();
            this.clientName = reader.readLine();
            System.out.println(clientName + " enter the chat!");
            server.broadcast(clientName + " enter the chat!", this);

            String message;
            while ((message = reader.readLine()) != null) {
                System.out.println(clientName + ": " + message);
                server.broadcast(message, this);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            server.removeWorker(this);
            System.out.println(clientName + " left the chat");
            server.broadcast(clientName + " left the chat", this);
        }
    }

    public void sendMessage(String message) {
        try {
            outputStream.write((message + "\n").getBytes());
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

