package gr.aueb.cf.testbed.ch26;

import java.io.*;
import java.net.Socket;

/**
 * Handles client connections and file requests.
 */
class ClientHandler implements Runnable {
    private Socket clientSocket;

    /**
     * Constructs a new ClientHandler.
     *
     * @param clientSocket The client socket to handle.
     */
    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    /**
     * Executes when the thread starts.
     * Reads a file path from the client, sends the file content (if found), or an error message.
     */
    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            String filePath = reader.readLine();
            File file = new File(filePath);

            if (file.exists() && file.isFile()) {
                BufferedReader fileReader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = fileReader.readLine()) != null) {
                    writer.println(line);
                }
                fileReader.close();
            } else {
                writer.println("File not found");
            }

            reader.close();
            writer.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

