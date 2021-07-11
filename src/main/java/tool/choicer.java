package tool;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class choicer {

    public static String folderPath = "";
    public static String jFileChooserUtil(){
        System.out.println("[Alroes Client | Log] Opened File Choicer");

        JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); // ���丮 ����
        chooser.setCurrentDirectory(new File("/")); // ���� ��� ���丮�� ����
        chooser.setAcceptAllFileFilterUsed(true);   // Fileter ��� ���� ����
        chooser.setDialogTitle("폴더 열기"); // â�� ����
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // ���� ���� ���

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Binary File", "cd11"); // filter Ȯ���� �߰�
        chooser.setFileFilter(filter); // ���� ���͸� �߰�

        int returnVal = chooser.showOpenDialog(null); // ����� â ����

        if(returnVal == JFileChooser.APPROVE_OPTION) { // ���⸦ Ŭ��
            folderPath = chooser.getSelectedFile().toString();
        }else if(returnVal == JFileChooser.CANCEL_OPTION){ // ��Ҹ� Ŭ��
            yst_discord_bot_IDE.truefalse = 1;
            System.out.println("[Alroes Client | Log] File Choice Has Been Cancel");
            folderPath = "";
        }

        return folderPath;

    }
    public static String jFileChoosermusic(){
        System.out.println("[Alroes Client | Log] Opened File Choicer");

        JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); // ���丮 ����
        chooser.setCurrentDirectory(new File("/")); // ���� ��� ���丮�� ����
        chooser.setAcceptAllFileFilterUsed(true);   // Fileter ��� ���� ����
        chooser.setDialogTitle("폴더 열기"); // â�� ����
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // ���� ���� ���

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Audio File", "wav");// filter Ȯ���� �߰�
        chooser.addChoosableFileFilter(filter);
        chooser.setAcceptAllFileFilterUsed(false);

        int returnVal = chooser.showOpenDialog(null); // ����� â ����

        if(returnVal == JFileChooser.APPROVE_OPTION) { // ���⸦ Ŭ��
            folderPath = chooser.getSelectedFile().toString();
        }else if(returnVal == JFileChooser.CANCEL_OPTION){ // ��Ҹ� Ŭ��
            yst_discord_bot_IDE.truefalse = 1;
            System.out.println("[Alroes Client | Log] File Choice Has Been Cancel");
            folderPath = "";
        }

        return folderPath;

    }
}
