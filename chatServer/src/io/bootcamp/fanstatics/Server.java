package io.bootcamp.fanstatics;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

public class Server {
    private final int port;
    private List<ServerWorker> workerList = new LinkedList<>();

    public Server(int port) {
        this.port = port;
    }

    public static void main(String[] args) {
        Server server = new Server(8500);
        server.start();
    }
    private void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Initialize server on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connect");

                ServerWorker worker = new ServerWorker(this, clientSocket);
                synchronized (workerList) {
                    workerList.add(worker);
                }
                new Thread(worker).start();
            }
    } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void broadcast(String message, ServerWorker serverWorker) {
        synchronized (workerList) {
            for (ServerWorker worker : workerList) {
                if (worker != serverWorker) {
                    worker.sendMessage(message);
                }
            }
        }
    }

    public void removeWorker(ServerWorker serverWorker) {
        synchronized (workerList) {
           workerList.remove(this);
        }
    }
}
