package tool;

import main.screen;

import javax.swing.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.util.Date;

public class stauts extends Thread{
    public static int ms;
    public static int mss;
    public void run() {
        while (true) {
            if(screen.frm.isVisible()== false)
                Thread.currentThread().stop();
            try {
                long timeToRespond = 0;
                //auth server
                InetAddress inetAddress = InetAddress.getByName("sql.alrose.cf");
                InetSocketAddress socketAddress = new InetSocketAddress(inetAddress, 3306);

                SocketChannel sc = SocketChannel.open();
                sc.configureBlocking(true);

                Date start = new Date();
                if (sc.connect(socketAddress)) {
                    Date stop = new Date();
                    timeToRespond = (stop.getTime() - start.getTime());
                }
                ms = (int) timeToRespond;
                //2 - Github.com image server
                long timeToResponds = 0;

                InetAddress inetAddresss = InetAddress.getByName("cdn.alrose.cf");
                InetSocketAddress socketAddresss = new InetSocketAddress("cdn.alrose.cf", 80);

                SocketChannel scs = SocketChannel.open();
                scs.configureBlocking(true);

                Date starts = new Date();
                if (scs.connect(socketAddresss)) {
                    Date stops = new Date();
                    timeToResponds = (stops.getTime() - starts.getTime());
                }
                mss = (int) timeToResponds;
                System.out.printf("\r%s","[Alrose Client | Log] Img Response time: " + timeToResponds + " ms, Sql Response time: " + timeToRespond + " ms");
            } catch (IOException ex) {
                System.out.println("[Alroes Client | ERROR] " + ex.getMessage());
            }
            screen.PING.setText("서버 상테/핑 " + "Online/" + ms + "ms, " + mss + "ms");
            screen.frm.repaint(1, screen.frm.getX(), screen.frm.getY(), 1500, 800);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
