package gr.aueb.cf.ch26;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ConcurrentFileServerApp {
    private static final int port = 6789;

    public static void main(String[] args) {
        try (ServerSocket servFd = new ServerSocket()) {
            servFd.bind(new InetSocketAddress("127.0.0.1", port));
            System.out.println("Server started ...");

            for (;;) {
                Socket connectedFd = servFd.accept();
                Thread socketThread = new Thread(new ConcurrentFileServer(connectedFd));
                socketThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
