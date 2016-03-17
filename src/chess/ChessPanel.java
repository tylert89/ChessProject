package chess;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tylerfaulk on 2/29/16.
 */
public class ChessPanel extends JPanel {

    private JButton[][] board;
    private ChessModel model;

    // declare other instance variables as needed

    private ButtonListener buttonListener = new ButtonListener();

    public ChessPanel() {
        this.setLayout(new GridLayout(model.getNumRows(), model.getNumCol())); //unsure what size

        model = new ChessModel();
        board = new JButton[model.getNumRows()][model.getNumCol()];

        createBoard();

    }

    private void createBoard() { // not sure if this is the best way
        for (int row = 0; row < model.getNumRows(); row++) {
            for (int col = 0; col < model.getNumCol(); col++) {
                //board[row][col] = new JButton(tileIcon);
                //board[row][col].setBorder(BorderFactory.
                        //createLineBorder(Color.gray, 1, false));//setting buttons to have a boarder
                board[row][col].addActionListener(buttonListener);
            }
        }
    }
    private void displayBoard() {

    }

    // add other helper methods as needed

    // inner class that represents action listener for buttons
    private class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            for (int row = 0; row < model.getNumRows(); row++) {
                for (int col = 0; col < model.getNumCol(); col++) {

                }
            }
        }
    }
}

