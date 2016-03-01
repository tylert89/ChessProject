package chess;

/**
 * Created by tylerfaulk on 2/29/16.
 */
public class ChessGUI {

    public sttic void main(String[] args) {
        JFrame frame = new JFRame("Chess Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_OC_CLOSE);

        ChessPanel panel = new ChessPanel();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
