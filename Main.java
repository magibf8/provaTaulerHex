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