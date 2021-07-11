package server;

import com.sun.org.apache.xpath.internal.operations.Variable;

import java.io.IOException;
import java.net.ServerSocket;

public class main {
    public static ServerSocket listener;
    public static void main(String[] args) {
        try {
            listener = new ServerSocket(3009);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
