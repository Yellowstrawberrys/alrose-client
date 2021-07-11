package main;

import javax.swing.*;
import java.awt.*;

public class gui {
    public static void main(String[] args){
        System.out.println("[Alrose Client | Log] Opening Alrose Client");
        // ������ ����
        JFrame frm = new JFrame("에일로즈 클라이언트");
        frm.setBackground(new Color(255, 255, 255));

        // ������ ũ�� ����
        frm.setSize(1500, 800);

        // �������� ȭ�� ����� ��ġ
        frm.setLocationRelativeTo(null);

        // �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // ���̾ƿ� ����
        frm.getContentPane().setLayout(null);

        /*
        * 에일로즈 클라이언트 버튼생성
        */
        JButton discordbot = new JButton("디스코드 봇 IDLE");
        JButton Recording = new JButton("녹화");
        JButton MinecraftpluginIDLE = new JButton("마인크래프트 플러그인 IDLE");
        JButton alrose_browser = new JButton("Alrose 브라우저");
        JButton chat = new JButton("Alrose 유저 체팅방");

        /*
        * 에일로즈 클라이언트 텍스트
        */
        JLabel user = new JLabel(Login.ID0+"님");
        JLabel Alrose = new JLabel("ALROSE");
        JLabel lite = new JLabel("-simple,lite,ALROSE-");
        JLabel welcome = new JLabel("환영합니다!");

        
    }
}
