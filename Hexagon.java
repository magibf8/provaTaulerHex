import javax.swing.*;
import java.awt.*;


class Hexagon extends JButton {
    private int SIDES = 6;
    private int SIDE_LENGTH = 50;

    private boolean escriure = false;

    private int i = 0;
    private int j = 0;

    public Hexagon(int row, int col) {
        setContentAreaFilled(false);
        setFocusPainted(true);
        setBorderPainted(false);
        setPreferredSize(new Dimension(95, 105));
        this.i = row;
        this.j = col;
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Polygon hex = new Polygon();
        for (int i = 0; i < SIDES; i++) {
            hex.addPoint((int) (50 + SIDE_LENGTH * Math.cos((1 + i * 2) * Math.PI / SIDES)), //calculation for side
                    (int) (50 + SIDE_LENGTH * Math.sin((1 + i * 2) * Math.PI / SIDES)));   //calculation for side
        }
        g2d.setStroke(new BasicStroke(4.0f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
        g.drawPolygon(hex);
    }

    public int getRow() {
        return i;
    }

    public int getCol() {
        return j;
    }
}