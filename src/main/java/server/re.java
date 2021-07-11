package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class re{
    public static String re(String ip){
        String input=null;
        try {
            Socket socket = new Socket(ip, 3009);
            Scanner in = new Scanner(socket.getInputStream());
            input = in.nextLine();
            new Logger(1, "RE", "Client input: "+input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
