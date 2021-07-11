package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class se extends Thread{
    List<Socket> user;
    List<String> name;
    String exit = "그 닉네임은 이미 존재합니다";
    public void run(){
        while (true) {
            try {
                Socket socket = main.listener.accept();
                user.add(socket);
                final String id = re.re(socket.getInetAddress().toString());
                if(name.contains(id)) {
                    socket.getOutputStream().write(exit.getBytes());
                    socket.close();
                }else
                    name.add(id);
                final String ms = re.re(socket.getInetAddress().toString());
                for(int i=0; user.size()==i; i++){
                    Socket sockets = user.get(i);
                    if(sockets.isConnected()){

                    }
                    final String sid = "id:"+id;
                    final String sms = "message:"+ms;
                    sockets.getOutputStream().write(sid.getBytes());
                    sockets.getOutputStream().write(sms.getBytes());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
