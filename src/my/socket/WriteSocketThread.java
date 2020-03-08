package my.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class WriteSocketThread extends Thread {

    private Socket socket;
    private OutputStream os;
    private PrintWriter pw;

    public WriteSocketThread(Socket socket){
        this.socket = socket;
        try {
            this.os = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.pw = new PrintWriter(os);
    }

    @Override
    public void run() {

        pw.flush();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            pw.println(scanner.nextLine());
            pw.flush();
        }

    }
}
