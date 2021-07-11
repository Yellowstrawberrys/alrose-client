package tool;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class yst_discord_bot_IDE {
    public static int truefalse;
    public static String yaya;
    public static String commands_1 = null;
    public static String commands_1_reply = null;
    public static String commands_2 = null;
    public static String commands_2_reply = null;
    public static String commands_3 = null;
    public static String commands_3_reply = null;
    public static String commands_4 = null;
    public static String commands_4_reply = null;
    public static String tos;
    public static String prefixs;
    public static String file;
    public static void main(String[] args) throws IOException {
        System.out.println("[Alroes Client | Log] Opened Alrose Client Discord Bot IDE");
        // ������ ����
        JFrame frms = new JFrame("Alroes Client discord bot IDE");
        frms.setBackground(new Color(255, 255, 255));

        // ������ ũ�� ����
        frms.setSize(1500, 800);

        // �������� ȭ�� ����� ��ġ
        frms.setLocationRelativeTo(null);

        // �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
        frms.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // ���̾ƿ� ����
        frms.getContentPane().setLayout(null);


        // ��ư ����
        JTextField prefix = new JTextField(10);
        JTextField to = new JTextField(10);
        JLabel prefixtxt = new JLabel("prefix :");
        JLabel totxt = new JLabel("토끈 :");
        JCheckBox space = new JCheckBox("prefix 다음에 건너 뛰기");
        JButton Save = new JButton("저장");
        JButton reload = new JButton("리로드");
        JButton btn3 = new JButton("기능 - 6");
        JButton btn4 = new JButton("기능 - 5");
        Save.setBackground(new Color(255, 255, 255));
        to.setBackground(new Color(255, 255, 255));
        reload.setBackground(new Color(255, 255, 255));
        btn3.setBackground(new Color(255, 255, 255));
        btn4.setBackground(new Color(255, 255, 255));
        prefix.setBackground(new Color(255, 255, 255));
        Image image = null;
        JLabel command_1_msg = new JLabel("1. 명령어 : ");
        JTextField command_1 = new JTextField(10);
        JLabel command_1_msg_1 = new JLabel(" 을/를 입력하면....");
        JTextField command_1_reply = new JTextField(10);
        JLabel command_1_msg_2 = new JLabel("라고 대답함");
        JLabel command_2_msg = new JLabel("2. 명령어 : ");
        JTextField command_2 = new JTextField(10);
        JLabel command_2_msg_1 = new JLabel(" 을/를 입력하면....");
        JTextField command_2_reply = new JTextField(10);
        JLabel command_2_msg_2 = new JLabel("라고 대답함");
        JLabel command_3_msg = new JLabel("3. 명령어 : ");
        JTextField command_3 = new JTextField(10);
        JLabel command_3_msg_1 = new JLabel(" 을/를 입력하면....");
        JTextField command_3_reply = new JTextField(10);
        JLabel command_3_msg_2 = new JLabel("라고 대답함");
        JLabel command_4_msg = new JLabel("4. 명령어 : ");
        JTextField command_4 = new JTextField(10);
        JLabel command_4_msg_1 = new JLabel(" 을/를 입력하면....");
        JTextField command_4_reply = new JTextField(10);
        JLabel command_4_msg_2 = new JLabel("라고 대답함");


        // �� ��ư ��ġ�� ũ�� ����
        space.setBounds(260, 1, 160, 40);
        prefixtxt.setBounds(110, 0, 50, 40);
        prefix.setBounds(160, 10, 100, 20);
        Save.setBounds(420, 10, 100, 20);
        totxt.setBounds(520, 10, 200, 20);
        to.setBounds(560, 10, 200, 20);
        reload.setBounds(770, 10, 100, 20);
        command_1_msg.setBounds(70, 100, 150, 40);
        command_1.setBounds(120, 107, 150, 25);
        command_1_msg_1.setBounds(270, 107, 80, 25);
        command_1_reply.setBounds(350, 107, 100, 25);
        command_1_msg_2.setBounds(455, 107, 100, 25);
        //+23
        command_2_msg.setBounds(70, 130, 150, 40);
        command_2.setBounds(120, 137, 150, 25);
        command_2_msg_1.setBounds(270, 137, 80, 25);
        command_2_reply.setBounds(350, 137, 100, 25);
        command_2_msg_2.setBounds(455, 137, 100, 25);
        //+23
        command_3_msg.setBounds(70, 153, 150, 40);
        command_3.setBounds(120, 160, 150, 25);
        command_3_msg_1.setBounds(270, 160, 80, 25);
        command_3_reply.setBounds(350, 160, 100, 25);
        command_3_msg_2.setBounds(455, 160, 100, 25);
        //+23
        command_4_msg.setBounds(70, 183, 150, 40);
        command_4.setBounds(120, 183, 150, 25);
        command_4_msg_1.setBounds(270, 183, 80, 25);
        command_4_reply.setBounds(350, 183, 100, 25);
        command_4_msg_2.setBounds(455, 183, 100, 25);
        // �� �����ӿ��ٰ� ��ư �߰�
        frms.getContentPane().add(Save);
        frms.getContentPane().add(reload);
        frms.getContentPane().add(totxt);
        frms.getContentPane().add(to);
        frms.getContentPane().add(space);
        frms.getContentPane().add(prefixtxt);
        frms.getContentPane().add(prefix);
        frms.add(command_1_msg);
        frms.add(command_1);
        frms.add(command_1_msg_1);
        frms.add(command_1_reply);
        frms.add(command_1_msg_2);
        frms.add(command_2_msg);
        frms.add(command_2);
        frms.add(command_2_msg_1);
        frms.add(command_2_reply);
        frms.add(command_2_msg_2);
        frms.add(command_3_msg);
        frms.add(command_3);
        frms.add(command_3_msg_1);
        frms.add(command_3_reply);
        frms.add(command_3_msg_2);
        frms.add(command_4_msg);
        frms.add(command_4);
        frms.add(command_4_msg_1);
        frms.add(command_4_reply);
        frms.add(command_4_msg_2);



        frms.setResizable(false);
        frms.setVisible(true);
        ImageIcon img1 = new ImageIcon(".\\pic\\A.png");
        frms.setIconImage(img1.getImage());

        Save.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                System.out.println("[Alroes Client | Log] Exporting File On "+file+"/bot/bot.py");
                System.out.println("[Alroes Client | Log] Exporting File On "+file+"/bot/start.bat");
                //커맨드 1이 비어있는지 확인
                if (command_1.getText().isEmpty()) {
                    System.out.println("[Alroes Client | ERROR] Can't Load Command For Bot");
                    JOptionPane.showMessageDialog(null, "다음 명령어를 인식 할 수 없습니다.", "에러 - 명령어를 인식 할 수 없음", JOptionPane.ERROR_MESSAGE);
                } else if (command_1_reply.getText().isEmpty()) {
                    System.out.println("[Alroes Client | ERROR] Can't Load Reply Message For Bot");
                    JOptionPane.showMessageDialog(null, "다음 답장을 인식 할 수 없습니다.", "에러 - 답장을 인식 할 수 없음", JOptionPane.ERROR_MESSAGE);
                }
                //커맨드 2가 비어있는지 확인
                else {
                    if (command_4.getText().isEmpty()) {
                        //비어있다면 이 문장을 실행
                        if (command_4_reply.getText().isEmpty()) {
                            if (command_3.getText().isEmpty()){
                                if (command_3_reply.getText().isEmpty()){
                                    if (command_2.getText().isEmpty()){
                                        if (command_2_reply.getText().isEmpty()){
                                            if (command_1.getText().isEmpty()) {
                                                JOptionPane.showMessageDialog(null, "다음 명령어를 인식 할 수 없습니다.", "에러 - 명령어를 인식 할 수 없음", JOptionPane.ERROR_MESSAGE);
                                            }
                                            choicer.jFileChooserUtil();
                                            if (truefalse == 1) {
                                                JOptionPane.showMessageDialog(null, "파일 선택이 취소됨", "파일 선택이 취소되었습니다", JOptionPane.ERROR_MESSAGE);
                                                return;
                                            }else {
                                                file = choicer.folderPath;
                                                try {
                                                    Charset.forName("UTF-8").newEncoder();
                                                    File dir = new File(file + "\\bot");
                                                    if(!dir.isDirectory()){
                                                        dir.mkdirs();
                                                    }

                                                    commands_1 = command_1.getText();
                                                    commands_1_reply = command_1_reply.getText();
                                                    prefixs = prefix.getText();
                                                    System.out.println(commands_1 + "이라고 입력하면, " + commands_1_reply + "이라고 대답함");
                                                    tos = to.getText();
                                                    FileWriter writer = new FileWriter(file + "\\bot\\bot.py");
                                                    Charset.forName("UTF-8").newEncoder();
                                                    writer.write("import discord\nclient = discord.Client() \n\n@client.event \nasync def on_message(message):\n    if message.content.startswith('" + prefixs + commands_1 + "'):\n        await message.channel.send('" + commands_1_reply + "')\n\n");
                                                    writer.close();
                                                    writer = new FileWriter(file + "\\bot\\bot.py", true); // ������ ������� �̾��
                                                    writer.write("client.run('" + tos + "')");
                                                    Charset.forName("UTF-8").newEncoder();
                                                    writer.close();
                                                    FileWriter writers = new FileWriter(file + "\\bot\\start.bat");
                                                    Charset.forName("UTF-8").newEncoder();
                                                    writers.write("py -m pip install discord.py\npip install discord.py\npy bot.py");
                                                    Charset.forName("UTF-8").newEncoder();
                                                    writers.close();
                                                    JOptionPane.showMessageDialog(null, "성공적으로 파일을 생성하였습니다! "+ file + "\\bot 에 있는 start.bat 을 관리자 권한으로 실행 시키세요.", "성공", JOptionPane.WARNING_MESSAGE);
                                                    System.exit(0);
                                                } catch (IOException e1) {
                                                    // TODO Auto-generated catch block
                                                    e1.printStackTrace();
                                                    System.exit(0);
                                                }
                                            }
                                        }
                                    } else { //2번째
                                        if(command_2_reply.getText().isEmpty()){
                                            JOptionPane.showMessageDialog(null, "다음 답장을 인식 할 수 없습니다.", "에러 - 답장을 인식 할 수 없음", JOptionPane.ERROR_MESSAGE);
                                        }else {

                                            try {
                                                choicer.jFileChooserUtil();
                                                file = choicer.folderPath;
                                                Charset.forName("UTF-8").newEncoder();
                                                File dir = new File(file + "\\bot");
                                                if(!dir.isDirectory()){
                                                    dir.mkdirs();
                                                }

                                                commands_1 = command_1.getText();
                                                commands_1_reply = command_1_reply.getText();
                                                commands_2 = command_2.getText();
                                                commands_2_reply = command_2_reply.getText();
                                                prefixs = prefix.getText();
                                                System.out.println(commands_1 + "이라고 입력하면, " + commands_1_reply + "이라고 대답함");
                                                System.out.println(commands_2 + "이라고 입력하면, " + commands_2_reply + "이라고 대답함");
                                                tos = to.getText();
                                                FileWriter writer = new FileWriter(file + "\\bot\\bot.py");
                                                Charset.forName("UTF-8").newEncoder();
                                                writer.write("import discord\nclient = discord.Client() \n\n@client.event \nasync def on_message(message):\n    if message.content.startswith('" + prefixs + commands_1 + "'):\n        await message.channel.send('" + commands_1_reply + "')\n");
                                                writer.close();
                                                //2
                                                writer = new FileWriter(file + "\\bot\\bot.py", true); // ������ ������� �̾��
                                                writer.write("    if message.content.startswith('" + prefixs + commands_2 + "'):\n        await message.channel.send('" + commands_2_reply + "')\n");
                                                Charset.forName("UTF-8").newEncoder();
                                                writer.close();
                                                //login
                                                writer = new FileWriter(file + "\\bot\\bot.py", true); // ������ ������� �̾��
                                                writer.write("client.run('" + tos + "')");
                                                Charset.forName("UTF-8").newEncoder();
                                                writer.close();
                                                //cmd
                                                FileWriter writers = new FileWriter(file + "\\bot\\start - 관리자 권한으로 실행.bat");
                                                writers.write("py -m pip install discord.py\npip install discord.py\npy bot.py\npip install discord.py --upgrade\npy -m pip install discord.py --upgrade");
                                                Charset.forName("UTF-8").newEncoder();
                                                writers.close();
                                                JOptionPane.showMessageDialog(null, "성공적으로 파일을 생성하였습니다! " + file +"\\\bot 에 있는 start.bat 을 관리자 권한으로 실행 시키세요.", "성공", JOptionPane.WARNING_MESSAGE);
                                                System.exit(0);
                                            } catch (IOException e1) {
                                                // TODO Auto-generated catch block
                                                e1.printStackTrace();
                                                System.exit(0);
                                            }

                                        }
                                    }
                                }
                            } else { //3번째
                                if(command_3_reply.getText().isEmpty()){
                                    JOptionPane.showMessageDialog(null, "다음 답장을 인식 할 수 없습니다.", "에러 - 답장을 인식 할 수 없음", JOptionPane.ERROR_MESSAGE);
                                }else {
                                    try {
                                        choicer.jFileChooserUtil();
                                        file = choicer.folderPath;
                                        Charset.forName("UTF-8").newEncoder();
                                        File dir = new File(file + "\\bot");
                                        if(!dir.isDirectory()){
                                            dir.mkdirs();
                                        }

                                        commands_1 = command_1.getText();
                                        commands_1_reply = command_1_reply.getText();
                                        commands_2 = command_2.getText();
                                        commands_2_reply = command_2_reply.getText();
                                        commands_3 = command_3.getText();
                                        commands_3_reply = command_3_reply.getText();
                                        prefixs = prefix.getText();
                                        System.out.println(commands_1 + "이라고 입력하면, " + commands_1_reply + "이라고 대답함");
                                        System.out.println(commands_2 + "이라고 입력하면, " + commands_2_reply + "이라고 대답함");
                                        System.out.println(commands_3 + "이라고 입력하면, " + commands_3_reply + "이라고 대답함");
                                        tos = to.getText();
                                        FileWriter writer = new FileWriter(file + "\\bot\\bot.py");
                                        Charset.forName("UTF-8").newEncoder();
                                        writer.write("import discord\nclient = discord.Client() \n\n@client.event \nasync def on_message(message):\n    if message.content.startswith('" + prefixs + commands_1 + "'):\n        await message.channel.send('" + commands_1_reply + "')\n");
                                        writer.close();
                                        //2
                                        writer = new FileWriter(file + "\\bot\\bot.py", true); // ������ ������� �̾��
                                        writer.write("    if message.content.startswith('" + prefixs + commands_2 + "'):\n        await message.channel.send('" + commands_2_reply + "')\n");
                                        Charset.forName("UTF-8").newEncoder();
                                        writer.close();
                                        //3
                                        writer = new FileWriter(file + "\\bot\\bot.py", true); // ������ ������� �̾��
                                        writer.write("    if message.content.startswith('" + prefixs + commands_3 + "'):\n        await message.channel.send('" + commands_3_reply + "')\n");
                                        Charset.forName("UTF-8").newEncoder();
                                        writer.close();
                                        //login
                                        writer = new FileWriter(file + "\\bot\\bot.py", true); // ������ ������� �̾��
                                        writer.write("client.run('" + tos + "')");
                                        Charset.forName("UTF-8").newEncoder();
                                        writer.close();
                                        //cmd
                                        FileWriter writers = new FileWriter(file + "\\bot\\start - 관리자 권한으로 실행.bat");
                                        writers.write("py -m pip install discord.py\npip install discord.py\npy bot.py\npip install discord.py --upgrade\npy -m pip install discord.py --upgrade");
                                        Charset.forName("UTF-8").newEncoder();
                                        writers.close();
                                        JOptionPane.showMessageDialog(null, "성공적으로 파일을 생성하였습니다! " + file +"\\\bot 에 있는 start.bat 을 관리자 권한으로 실행 시키세요.", "성공", JOptionPane.WARNING_MESSAGE);
                                        System.exit(0);
                                    } catch (IOException e1) {
                                        // TODO Auto-generated catch block
                                        e1.printStackTrace();
                                        System.exit(0);
                                    }
                                }
                            }

                        }
                    } else {

                        try {
                            choicer.jFileChooserUtil();
                            file = choicer.folderPath;
                            Charset.forName("UTF-8").newEncoder();
                            File dir = new File(file + "\\bot");
                            if(!dir.isDirectory()){
                                dir.mkdirs();
                            }

                            commands_1 = command_1.getText();
                            commands_1_reply = command_1_reply.getText();
                            commands_2 = command_2.getText();
                            commands_2_reply = command_2_reply.getText();
                            commands_3 = command_3.getText();
                            commands_3_reply = command_3_reply.getText();
                            commands_4 = command_4.getText();
                            commands_4_reply = command_4_reply.getText();
                            prefixs = prefix.getText();
                            System.out.println(commands_1 + "이라고 입력하면, " + commands_1_reply + "이라고 대답함");
                            System.out.println(commands_2 + "이라고 입력하면, " + commands_2_reply + "이라고 대답함");
                            System.out.println(commands_3 + "이라고 입력하면, " + commands_3_reply + "이라고 대답함");
                            System.out.println(commands_4 + "이라고 입력하면, " + commands_4_reply + "이라고 대답함");
                            tos = to.getText();
                            FileWriter writer = new FileWriter(file + "\\bot\\bot.py");
                            Charset.forName("UTF-8").newEncoder();
                            writer.write("import discord\nclient = discord.Client() \n\n@client.event \nasync def on_message(message):\n    if message.content.startswith('" + prefixs + commands_1 + "'):\n        await message.channel.send('" + commands_1_reply + "')\n");
                            writer.close();
                            //2
                            writer = new FileWriter(file + "\\bot\\bot.py", true); // ������ ������� �̾��
                            writer.write("    if message.content.startswith('" + prefixs + commands_2 + "'):\n        await message.channel.send('" + commands_2_reply + "')\n");
                            Charset.forName("UTF-8").newEncoder();
                            writer.close();
                            //3
                            writer = new FileWriter(file + "\\bot\\bot.py", true); // ������ ������� �̾��
                            writer.write("    if message.content.startswith('" + prefixs + commands_3 + "'):\n        await message.channel.send('" + commands_3_reply + "')\n");
                            Charset.forName("UTF-8").newEncoder();
                            writer.close();
                            //4
                            writer = new FileWriter(file + "\\bot\\bot.py", true); // ������ ������� �̾��
                            writer.write("    if message.content.startswith('" + prefixs + commands_4 + "'):\n        await message.channel.send('" + commands_4_reply + "')\n");
                            Charset.forName("UTF-8").newEncoder();
                            writer.close();
                            //login
                            writer = new FileWriter(file + "\\bot\\bot.py", true); // ������ ������� �̾��
                            writer.write("client.run('" + tos + "')");
                            Charset.forName("UTF-8").newEncoder();
                            writer.close();
                            //cmd
                            FileWriter writers = new FileWriter(file + "\\bot\\start - 관리자 권한으로 실행.bat");
                            writers.write("py -m pip install discord.py\npip install discord.py\npy bot.py\npip install discord.py --upgrade\npy -m pip install discord.py --upgrade");
                            Charset.forName("UTF-8").newEncoder();
                            writers.close();
                            JOptionPane.showMessageDialog(null, "성공적으로 파일을 생성하였습니다! " + file +"\\\bot 에 있는 start.bat 을 관리자 권한으로 실행 시키세요.", "성공", JOptionPane.WARNING_MESSAGE);
                            System.exit(0);

                        } catch (IOException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                            System.out.println("[Alroes Client | ERROR] "+e1);
                            System.exit(0);
                        }


                    }
                }



            }});





    }





}






