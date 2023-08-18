package gr.aueb.cf.ch26;

import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ConcurrentFileServer implements Runnable {
    private final Socket sockFd;
    private Scanner in = null;

    public ConcurrentFileServer(Socket sockFd) {
        this.sockFd = sockFd;
    }

    @Override
    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sockFd.getOutputStream()));
             BufferedReader br = new BufferedReader(new InputStreamReader(sockFd.getInputStream()))) {
            String filename = br.readLine();

            if (!Files.exists(Paths.get(filename))) {
                bw.write("Not found");
                bw.flush();
                sockFd.close();
                return;
            }

            in = new Scanner(new File(filename));
            String line;
            while ((line = in.nextLine()) != null) {
                bw.write(line);
                bw.write("\n");
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null ) in.close();
                if (sockFd != null) sockFd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
