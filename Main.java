/*import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Main extends JPanel {
    private static final long serialVersionUID = 1L;
    private final int WIDTH = 1000;
    private final int HEIGHT = 600;

    private final int files = 4;
    private final int columnes = 4;


    public Main() {
        JPanel panel = new JPanel();
        JPanel tauler = new JPanel();
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.DARK_GRAY);

        GridLayout lay = new GridLayout(3,3);
        tauler.setLayout(lay);
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                tauler.add(new Hexagon());
            }
        }

        add(tauler);
        setVisible(true);

    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        Main p = new Main();

        f.setContentPane(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}*/

import javax.swing.JFrame;

public class Main {
    private static final int COLUMNES = 8;
    private static final int FILES = 7;

    public static void main(String [] args)
    {
        TaulerHexagon tauler = new TaulerHexagon(FILES,COLUMNES);
        JFrame frame = new JFrame();
        frame.setTitle("Tauler");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(tauler);
        frame.setSize(950, 725);
        frame.setResizable(true);
        frame.setVisible(true);
    }
}