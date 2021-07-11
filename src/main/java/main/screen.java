package main;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import jdk.nashorn.internal.objects.annotations.Property;
import tool.stauts;
import tool.yst_discord_bot_IDE;

public class screen {
    public static JFrame frm = new JFrame("에일로즈 클라이언트");
    public static JLabel NAME;
    public static JLabel PING;
    public static void main(String[] args) throws IOException {
        System.out.println("[Alroes Client | Log] Opening Alrose Client");

        // ������ ����
        frm.setBackground(new Color(255, 255, 255));

        // ������ ũ�� ����
        frm.setSize(1500, 800);

        // �������� ȭ�� ����� ��ġ
        frm.setLocationRelativeTo(null);

        // �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // ���̾ƿ� ����
        frm.getContentPane().setLayout(null);

        // set icon


        // ��ư ����
        JButton btn1 = new JButton("기능 - 8");
        JButton btn2 = new JButton("기능 - 7");
        JButton btn3 = new JButton("Thdis Studio의 제품 다운로드");
        JButton btn4 = new JButton("Xkeeper 방지기");
        JButton IDE = new JButton("에일로즈 디스코드 봇IDE");
        JButton btn6 = new JButton("에일로즈 브라우저(베타)");
        JButton btn7 = new JButton("음성 인식");
        JButton btn8 = new JButton("채팅");
        btn8.setEnabled(false);
        btn7.setEnabled(false);
        btn4.setEnabled(false);
        btn3.setEnabled(false);
        btn2.setEnabled(false);
        btn1.setEnabled(false);
        JLabel ID;
        btn1.setBackground(new Color(255, 255, 255));
        btn2.setBackground(new Color(255, 255, 255));
        btn3.setBackground(new Color(255, 255, 255));
        btn4.setBackground(new Color(255, 255, 255));
        IDE.setBackground(new Color(255, 255, 255));
        btn6.setBackground(new Color(255, 255, 255));
        btn7.setBackground(new Color(255, 255, 255));
        btn8.setBackground(new Color(255, 255, 255));
        Image image = null;

        // �� ��ư ��ġ�� ũ�� ����
        btn1.setBounds(70, 640, 150, 40);
        btn2.setBounds(70, 580, 150, 40);
        btn3.setBounds(70, 520, 150, 40);
        btn4.setBounds(70, 460, 150, 40);
        IDE.setBounds(70, 400, 150, 40);
        btn6.setBounds(70, 340, 150, 40);
        btn7.setBounds(70, 280, 150, 40);
        btn8.setBounds(70, 220, 150, 40);

        NAME = new JLabel("사용자 이름: " + Login.ID0);
        NAME.setBounds(1100, 10, 1000, 100);
        PING = new JLabel("서버 상테/핑 " + "Online/" + stauts.ms + "ms, " + stauts.mss + "ms");
        PING.setBounds(1100, 30, 1000, 100);
        // �� �� ����


        JLabel imgLbl = new JLabel();
        try {
            URL url1 = new URL("http://alroes.kro.kr/user/"+Login.ID0+".png");
            image = ImageIO.read(url1);
        }catch (IIOException e) {
            URL url11 = new URL("http://alroes.kro.kr/user/usr.png");
            image = ImageIO.read(url11);
        }
        Image img = image.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon bsImg = new ImageIcon(img);

        // �� �󺧿� ������ ����
        imgLbl.setSize(200, 200);
        imgLbl.setIcon(bsImg);

        // �� ��Ÿ ����
        imgLbl.setBounds(20, 10, 200, 200);
        imgLbl.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(imgLbl);
        // �� �����ӿ��ٰ� ��ư �߰�
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
        frm.getContentPane().add(btn3);
        frm.getContentPane().add(btn4);
        frm.getContentPane().add(IDE);
        frm.getContentPane().add(btn6);
        frm.getContentPane().add(btn7);
        frm.getContentPane().add(btn8);
        frm.getContentPane().add(NAME);
        frm.getContentPane().add(PING);

        ImageIcon img1 = new ImageIcon(".\\pic\\A.png");
        frm.setIconImage(img1.getImage());
        // �������� ���̵��� ����
        frm.setResizable(false);
        frm.setVisible(true);
        System.out.println("[Alroes Client | Log] Alrose Client GUI loaded finished");
        tool.stauts st = new tool.stauts();
        st.setPriority(Thread.MIN_PRIORITY);
        st.start();
        IDE.addActionListener(new ActionListener() { // �͸�Ŭ������ ������ �ۼ�
            public void actionPerformed(ActionEvent e) {
                try {
                    System.out.println("[Alroes Client | Log] Opening Discord Bot Maker");
                    yst_discord_bot_IDE.main(args);
                } catch (IOException e1) {
                    System.out.println("[Alroes Client | ERROR] "+e1);
                    e1.printStackTrace();
                }
            }
        });
        btn6.addActionListener(new ActionListener() { // �͸�Ŭ������ ������ �ۼ�
            public void actionPerformed(ActionEvent e) {
                System.out.println("[Alroes Client | Log] Opening Alrose Web-browser");
                //Create a process builder
                ProcessBuilder builder = new ProcessBuilder("Alroseb.exe");
                //start it
                try {
                    Process process = builder.start();
                    System.out.println("[Alroes Client | Warn] Opened");
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    System.out.println("[Alroes Client | Error] "+e1);
                    e1.printStackTrace();
                }

            }
        });


    }




}



