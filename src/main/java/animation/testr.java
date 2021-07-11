package animation;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class testr extends JPanel implements ActionListener {
    final int w = 500;
    final int h = 500;
    Image image;
    int xv=1;
    int yv=1;
    int x=0;
    int y=0;
    Timer timer;
    testr(){
        this.setPreferredSize(new Dimension(w,h));
        this.setBackground(Color.black);
        try {
            image = new ImageIcon(ImageIO.read(this.getClass().getResource("/resources/a.png"))).getImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
        timer = new Timer(1000,null);
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(image, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
