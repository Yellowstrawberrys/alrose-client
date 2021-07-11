package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Login {
    public static String Pass;
    public static String ID0;
    public static JFrame frm = new JFrame("Alrose Clinet Login");
    public static char[] Code;

    public static void main(String[] args) {
        JTextField tfName = new JTextField(10); // �̸� �Է�â
        JPasswordField tfPassword = new JPasswordField(10); // ��ȣ �Է�â
        Font font1 = null;
        try{
            font1 = Font.createFont(Font.TRUETYPE_FONT, new File(Login.class.getResource("/FHR.ttf").getFile()));
        }
        catch(IOException | FontFormatException | NullPointerException e){
            font1 = new Font(Font.SANS_SERIF, Font.PLAIN, 12);
        }

        try {
            URL is = Login.class.getResource("resources/lb.png");
            if(is == null)
                frm.setContentPane(new JLabel(new ImageIcon(ImageIO.read(Login.class.getResourceAsStream("/lb.png")))));
            else
                frm.setContentPane(new JLabel(new ImageIcon(ImageIO.read(is))));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("[Alroes Client | ERROR] " + e);
            try {
                frm.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("resources/lb.png")))));
            } catch (IOException e1) {
                e1.printStackTrace();
                System.out.println("[Alroes Client | ERROR] " + e1);
            }
        }
        // ������ ũ�� ����
        frm.setSize(660, 400);

        // �������� ȭ�� ����� ��ġ
        frm.setLocationRelativeTo(null);

        // �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ���̾ƿ� ����
        frm.getContentPane().setLayout(null);

        // set icon

        // ��ư ����
        JButton btn1 = new JButton("Login with Google");
        JButton btn2 = new JButton("Login");
        btn2.setEnabled(true);
        btn1.setEnabled(false);
        btn1.setBackground(Color.black);
        btn1.setOpaque(true);
        JLabel ID = new JLabel("LOGIN");
        JLabel Title = new JLabel("WELLCOME TO ALROSE");
        JLabel subtitle = new JLabel("LITE, SIMPLE AND ALROSE");
        btn1.setForeground(new Color(255, 255, 255));
        btn2.setBackground(new Color(255, 255, 255));
        JLabel IDs = new JLabel("ID");
        JLabel IDss = new JLabel("PASSWORD");
        ID.setFont(font1.deriveFont(33.0f));
        IDs.setFont(font1.deriveFont(30.0f));
        IDss.setFont(font1.deriveFont(30.0f));
        Title.setFont(font1.deriveFont(35.0f));
        subtitle.setFont(font1.deriveFont(20.0f));
        Title.setForeground(Color.white);
        ID.setForeground(Color.white);
        IDs.setForeground(Color.white);
        IDss.setForeground(Color.white);
        subtitle.setForeground(Color.white);
        // �� ��ư ��ġ�� ũ�� ����
        btn1.setBounds(10, 300, 145, 40);
        btn2.setBounds(490, 300, 145, 40);
        Title.setBounds(110, 5, 900, 60);
        subtitle.setBounds(185, 305, 300, 30);
        ID.setBounds(270, 70, 900, 60);
        IDs.setBounds(145, 140, 300, 30);
        IDss.setBounds(10, 200, 300, 30);
        tfName.setBounds(180, 140, 300, 30);
        tfPassword.setBounds(180, 200, 300, 30);


        // �� �����ӿ��ٰ� ��ư �߰�
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
        frm.getContentPane().add(ID);
        frm.getContentPane().add(IDs);
        frm.getContentPane().add(IDss);
        frm.getContentPane().add(tfName);
        frm.getContentPane().add(tfPassword);
        frm.getContentPane().add(Title);
        frm.getContentPane().add(subtitle);
        // �������� ���̵��� ����
        frm.setResizable(false);
        frm.setVisible(true);


        btn2.addActionListener(new ActionListener() { // �͸�Ŭ������ ������ �ۼ�
            public void actionPerformed(ActionEvent e) {
                ID0 = tfName.getText();
                Code = tfPassword.getPassword();
                Pass = String.valueOf(Code);
                System.out.println("[Alroes Client | Log] Requseted Login Check");
                yaya.main(args);

            }
        });
    }
}
