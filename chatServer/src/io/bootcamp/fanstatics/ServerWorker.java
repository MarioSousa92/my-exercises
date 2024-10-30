package io.bootcamp.fanstatics;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class ServerWorker implements Runnable {

    private final Server server;
    private final Socket clientSocket;
    private PrintWriter out;
    private List<ServerWorker> workerList;
    private String clientName;

    public ServerWorker(Server server, Socket clientSocket) {
        this.server = server;
        this.clientSocket = clientSocket;
        this.workerList = workerList;
    }

    @Override
    public void run() {
        String message;
        try {
            out = new PrintWriter(clientSocket.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            out.write("Client name: ");
            out.flush();
            this.clientName = reader.readLine();
            System.out.println(clientName + " enter the chat!");
            server.broadcast(clientName + " enter the chat!", this);

            while ((message = reader.readLine()) != null) {
                if (message.equalsIgnoreCase("List")) {
                    sendClientList();
                }
                System.out.println(clientName + ": " + message);
                server.broadcast(message, this);
            }
        } catch (IOException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }

    private void sendClientList() {
            StringBuilder clientNames = new StringBuilder("Connected clients:\n");
            for (ServerWorker worker : workerList) {
                clientNames.append(worker.clientName).append("\n");
            }
            out.println(clientNames);
        }

    public void sendMessage(String message) {
        for (ServerWorker worker : workerList) {
            if (worker != this) {
                worker.out.println(message);
            }
        }
    }
}




