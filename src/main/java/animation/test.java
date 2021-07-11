package animation;

import javax.swing.*;

public class test extends JFrame {
    testr t;
    test(){

        t = new testr();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(t);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
