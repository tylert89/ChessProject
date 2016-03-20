package chess;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/***********************************************************************
 *
 * Plays Chess
 *
 * @author Jake, Tyler, Jonathan
 * @version 1.0
 *
 **********************************************************************/

/**
 * Created by tylerfaulk on 2/29/16.
 */
public class ChessGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new MigLayout("debug, fill") );
        ChessPanel panel = new ChessPanel();
        frame.getContentPane().add(panel, "center, grow");

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
