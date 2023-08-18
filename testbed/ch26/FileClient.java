package gr.aueb.cf.testbed.ch26;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * A client program that requests a file from a server.
 */
public class FileClient {
    private static final String SERVER_IP = "127.0.0.1";
    private static final int SERVER_PORT = 12345;

    /**
     * The main method that runs the client program.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {

        try {
                Socket socket = new Socket(InetAddress.getByName(SERVER_IP), SERVER_PORT);
                Scanner scanner = new Scanner(System.in);
                PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.print("Enter file path: ");
            String filePath = scanner.nextLine();
            writer.println(filePath);

            String line;
            while ((line = serverReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


