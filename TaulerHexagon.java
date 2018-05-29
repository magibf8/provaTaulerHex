import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TaulerHexagon extends JPanel {
    private int Files;
    private int Columnes;


    public TaulerHexagon(int files, int columnes) {
        setLayout(null);

        this.Files = files;
        this.Columnes = columnes;

        Hexagon[][] botons = new Hexagon[Files][Columnes];

        int moux = -5;
        int mouy = 0;

        for(int i = 0; i < Files; i++) {
            for (int j = 0; j < Columnes; j++) {
                botons[i][j] = new Hexagon(i, j);
                botons[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Hexagon boto = (Hexagon) e.getSource();
                        System.out.println("[" + boto.getRow() + "][" + boto.getCol() + "]");
                    }
                });
                add(botons[i][j]);
                botons[i][j].setBounds(moux, mouy, 100, 105);
                moux += 90;
            }
            if (i % 2 == 0) moux = 39;
            else moux = -5;
            mouy += 75;
        }
    }
}