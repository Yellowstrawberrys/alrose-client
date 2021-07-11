package tool;

import com.google.common.io.CharSource;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import javax.sound.sampled.*;
import javax.sound.sampled.spi.AudioFileReader;
import javax.swing.*;

public class music_player {
    public static JFrame frm = new JFrame("에일로즈 음악 플레이어");
    public static DefaultListModel<String> l1 = new DefaultListModel<>();
    static String path;
    // to store current position
    Long currentFrame;
    Clip clip;

    // current status of clip
    String status;

    AudioInputStream audioInputStream;
    static String filePath;

    static MediaPlayer mediaPlayer = null;
    // constructor to initialize streams and clip
    public music_player(){

        try {
            File file = new File(filePath);
            // create AudioInputStream object
            audioInputStream = AudioSystem.getAudioInputStream(file);
            music.add(filePath);
        } catch (UnsupportedAudioFileException | IOException e){
            Media hit = new Media(new File(filePath).toURI().toString());
            mediaPlayer = new MediaPlayer(hit);
        }


        try {
            clip = AudioSystem.getClip();
            clip.loop(0);
            clip.open(audioInputStream);
        }catch (LineUnavailableException | IOException e1){
            mediaPlayer.play();
        }
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public static void main(String[] args)
    {
        try
        {

            frm.setBackground(new Color(255, 255, 255));

            // ������ ũ�� ����
            frm.setSize(1500, 800);

            // �������� ȭ�� ����� ��ġ
            frm.setLocationRelativeTo(null);

            // �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
            frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            // ���̾ƿ� ����
            frm.getContentPane().setLayout(null);

            JList<String> list1 = new JList<>(l1);
            list1.setBounds(100, 20, 200, 500);
            choicer.jFileChoosermusic();
            filePath = choicer.folderPath;
            System.out.println(choicer.folderPath);

            JButton play = new JButton("Play");

            play.setBounds(20, 20, 70, 40);
            play.setBackground(Color.white);
            frm.getContentPane().add(play);
            frm.getContentPane().add(list1);
            JButton stop = new JButton("Stop");

            play.setBounds(20, 70, 70, 40);
            play.setBackground(Color.white);
            frm.getContentPane().add(play);
            music_player audioPlayer =
                    new music_player();

            play.addActionListener(new ActionListener() { // �͸�Ŭ������ ������ �ۼ�
                public void actionPerformed(ActionEvent e) {

                    System.out.println("[Alroes Client | Log] Playing Music");
                    if(list1.getSelectedIndex() != -1){
                        try {
                            AudioInputStream audioInputStreams = AudioSystem.getAudioInputStream(new File(filePath));
                            audioPlayer.clip.open(audioInputStreams);
                            audioPlayer.clip.loop(0);
                            audioPlayer.play();
                        } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                            unsupportedAudioFileException.printStackTrace();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        } catch (LineUnavailableException lineUnavailableException) {
                            lineUnavailableException.printStackTrace();
                        }
                    }else {
                        try {
                            audioPlayer.clip.loop(0);
                            audioPlayer.gotoChoice(6);
                            audioPlayer.play();
                        } catch (IOException ioException) {
                            mediaPlayer.play();
                            ioException.printStackTrace();
                        } catch (LineUnavailableException lineUnavailableException) {
                            mediaPlayer.play();
                            lineUnavailableException.printStackTrace();
                        } catch (UnsupportedAudioFileException unsupportedAudioFileException) {

                            unsupportedAudioFileException.printStackTrace();
                        }
                    }
                }
            });
            frm.setResizable(false);
            frm.setVisible(true);
        }

        catch (Exception ex)
        {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();

        }

    }

    // Work as the user enters his choice

    private void gotoChoice(int c) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        switch (c)
        {
            case 1:
                pause();
                break;
            case 2:
                resumeAudio();
                break;
            case 3:
                restart();
                break;
            case 4:
                stop();
                break;
            case 5:
                System.out.println("Enter time (" + 0 +
                        ", " + clip.getMicrosecondLength() + ")");
                Scanner sc = new Scanner(System.in);
                long c1 = sc.nextLong();
                jump(c1);
                break;
            case 6:
                play();

        }

    }

    // Method to play the audio
    public void play()
    {
            clip.start();
            clip.loop(0);
            mediaPlayer.play();
            status = "play";

    }

    // Method to pause the audio
    public void pause()
    {
        if (status.equals("paused"))
        {
            System.out.println("audio is already paused");
            return;
        }
        this.currentFrame =
                this.clip.getMicrosecondPosition();
        clip.stop();
        status = "paused";
    }

    // Method to resume the audio
    public void resumeAudio() throws UnsupportedAudioFileException,
            IOException, LineUnavailableException
    {
        if (status.equals("play"))
        {
            System.out.println("Audio is already "+
                    "being played");
            return;
        }
        clip.close();
        resetAudioStream();
        clip.setMicrosecondPosition(currentFrame);
        clip.loop(0);
        this.play();
    }

    // Method to restart the audio
    public void restart() throws IOException, LineUnavailableException,
            UnsupportedAudioFileException
    {
        clip.stop();
        clip.close();
        resetAudioStream();
        currentFrame = 0L;
        clip.setMicrosecondPosition(0);
        clip.loop(0);
        this.play();
    }

    // Method to stop the audio
    public void stop() throws UnsupportedAudioFileException,
            IOException, LineUnavailableException
    {
        currentFrame = 0L;
        clip.stop();
        clip.close();
    }

    // Method to jump over a specific part
    public void jump(long c) throws UnsupportedAudioFileException, IOException,
            LineUnavailableException
    {
        if (c > 0 && c < clip.getMicrosecondLength())
        {
            clip.stop();
            clip.close();
            resetAudioStream();
            currentFrame = c;
            clip.setMicrosecondPosition(c);
            clip.loop(0);
            this.play();
        }
    }

    // Method to reset audio stream
    public void resetAudioStream() throws UnsupportedAudioFileException, IOException,
            LineUnavailableException
    {
        audioInputStream = AudioSystem.getAudioInputStream(
                new File(filePath).getAbsoluteFile());
        clip.open(audioInputStream);
        clip.loop(0);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void plays(){
        play();
    }


}
