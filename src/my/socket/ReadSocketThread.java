package my.socket;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class ReadSocketThread extends Thread   {

    private Socket socket;

    private Scanner scanner;


    public ReadSocketThread(Socket socket) throws IOException {
        this.socket = socket;
        this.scanner = new Scanner(socket.getInputStream());
    }

    @Override
    public void run() {
        while(true){
            try {
                System.out.println(scanner.nextLine());

            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
