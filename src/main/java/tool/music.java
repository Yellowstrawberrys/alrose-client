package tool;

import java.nio.file.Path;

public class music {
    public static void add(String p){
        music_player.l1.addElement(p);

        music_player.frm.repaint();
    }
}
