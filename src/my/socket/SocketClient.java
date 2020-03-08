package my.socket;

import java.io.*;
import java.net.Socket;

public class SocketClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",55532);

        ReadSocketThread readSocketThread = new ReadSocketThread(socket);
        readSocketThread.start();

        WriteSocketThread writeSocketThread = new WriteSocketThread(socket);
        writeSocketThread.start();



    }
}
