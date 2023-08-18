package gr.aueb.cf.testbed.ch26;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * A server program that handles file requests from clients.
 */
public class FileServer {
    private static final int PORT = 12345;

    /**
     * The main method that starts the server program.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server listening on port " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                Thread clientThread = new Thread(new ClientHandler(clientSocket));
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



