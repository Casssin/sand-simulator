package ui;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {    
    private MainPanel mp;

    public Main() {
        super("Game Of Life");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        mp = new MainPanel();
        this.add(mp);
        setUndecorated(false);
        setVisible(true);
        this.pack();
        centreOnScreen();
        mp.gameLoop();
    }

    // MODFIES: this
    // EFFECTS: location of frame is set so frame is centered on desktop
    private void centreOnScreen() {
        Dimension scrn = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((scrn.width - getWidth()) / 2, (scrn.height - getHeight()) / 2);
    }

    public static void main(String[] args) {
        new Main();
    }
}