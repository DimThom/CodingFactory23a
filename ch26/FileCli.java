package gr.aueb.cf.ch26;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class FileCli {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Socket socket = null;
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            InetAddress servAddress = InetAddress.getByName("127.0.0.1");
            int servPort = 6789;

            socket = new Socket(servAddress, servPort);
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            String filename = "C:\\tmp\\log-mobile.txt\n";
            bw.write(filename);
            bw.flush();

            String line = "";
            while ((line = br.readLine()) != null) {
                //sb.append(line).append("\n");
                System.out.println(line);
            }
            //System.out.println("File is: " + sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) br.close();
                if (socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
