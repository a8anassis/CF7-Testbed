package gr.aueb.cf.ch26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer extends Thread {

    @Override
    public void run() {
        ServerSocket servFd = null;
        final int SERVER_PORT = 7;

        try {
            servFd = new ServerSocket();
            servFd.bind(new InetSocketAddress("127.0.0.1", SERVER_PORT));
            System.out.println("Server Started ...");

            while (true) {
                Socket connectedFd = servFd.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(connectedFd.getInputStream()));
                PrintWriter pw = new PrintWriter(connectedFd.getOutputStream());
                String line = "";

                do {
                    line = br.readLine();
                    pw.println(line);
                    pw.flush();
                } while (!line.equals("BYE"));
                connectedFd.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (servFd != null) servFd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
