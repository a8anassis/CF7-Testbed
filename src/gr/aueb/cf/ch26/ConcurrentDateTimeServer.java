package gr.aueb.cf.ch26;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

public class ConcurrentDateTimeServer implements Runnable {

    private final Socket socket;

    public ConcurrentDateTimeServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {
            bw.write(new Date().toString());
            bw.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
