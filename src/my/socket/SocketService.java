package my.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketService {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(55532);

        System.out.println("ServiceSocket已启动,等待Client连接");

        Socket socket = serverSocket.accept();

//        OutputStream os = socket.getOutputStream();
//        PrintWriter pw = new PrintWriter(os);
//        pw.write("Welcome!");
//        pw.flush();
        WriteSocketThread writeSocketThread = new WriteSocketThread(socket);
        writeSocketThread.start();
        ReadSocketThread readSocketThread = new ReadSocketThread(socket);
        readSocketThread.start();





    }

}
