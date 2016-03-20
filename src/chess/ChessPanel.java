package chess;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//230

/***********************************************************************
 * Plays Chess
 *
 * @author Jake, Tyler, Jonathan
 * @version 1.0
 **********************************************************************/

/**
 * Created by tylerfaulk on 2/29/16.
 */
public class ChessPanel extends JPanel {

    private JButton[][] board;
    private ChessModel model;

    // declare other instance variables as needed

    private ButtonListener buttonListener = new ButtonListener();

    public ChessPanel() {

        MigLayout layout = new MigLayout("wrap 1", "[grow,fill]"); //setting to view grid lines etc
        this.setLayout(layout);

        model = new ChessModel();
        board = new JButton[8][8];



        JPanel boardPanel = new JPanel(new MigLayout("fill", "grow"));
        boardPanel.add(createButtonBoard(), "center,");
        displayBoard();
        this.add(boardPanel, "center, span");


    }

    private JPanel createButtonBoard() { // not sure if this is the best way
        int count = 1;
        JPanel boardPanel = new JPanel(new GridLayout(8,8));
        for (int row = 0; row < model.getNumRows(); row++) {
            for (int col = 0; col < model.getNumCol(); col++) {
                board[row][col] = new JButton();

                if (count % 2 == 0)
                    board[row][col].setBackground(Color.blue);
                if (!(col == 7))
                    count++;

                //board[row][col].setBorder(BorderFactory.
                  //      createLineBorder(Color.gray, 1, false));//setting buttons to have a boarder
                board[row][col].addActionListener(buttonListener);
                board[row][col].setPreferredSize(new Dimension(100,100));
                boardPanel.add(board[row][col]);

            }
        }

        return boardPanel;
    }

    private void displayBoard() {
        for (int row = 0; row < model.getNumRows(); row++) {
            for (int col = 0; col < model.getNumCol(); col++) {
                if (model.pieceAt(row, col) != null) {
                    if (model.pieceAt(row, col).type() == "Pawn") {
                        if (model.pieceAt(row, col).player() == Player.WHITE) {
                            board[row][col].setIcon(new ImageIcon("R Pawn.png"));
                        } else {
                            board[row][col].setIcon(new ImageIcon("B Pawn.png"));
                        }
                    } else if (model.pieceAt(row, col).type() == "Rook") {
                        if (model.pieceAt(row, col).player() == Player.WHITE) {
                            board[row][col].setIcon(new ImageIcon("R Rook.png"));
                        } else {
                            board[row][col].setIcon(new ImageIcon("B Rook.png"));
                        }
                    } else if (model.pieceAt(row, col).type() == "Knight") {
                        if (model.pieceAt(row, col).player() == Player.WHITE) {
                            board[row][col].setIcon(new ImageIcon("R Knight.png"));
                        } else {
                            board[row][col].setIcon(new ImageIcon("B Knight.png"));
                        }
                    } else if (model.pieceAt(row, col).type() == "Bishop") {
                        if (model.pieceAt(row, col).player() == Player.WHITE) {
                            board[row][col].setIcon(new ImageIcon("R Bishop.png"));
                        } else {
                            board[row][col].setIcon(new ImageIcon("B Bishop.png"));
                        }
                    } else if (model.pieceAt(row, col).type() == "Queen") {
                        if (model.pieceAt(row, col).player() == Player.WHITE) {
                            board[row][col].setIcon(new ImageIcon("R Queen.png"));
                        } else {
                            board[row][col].setIcon(new ImageIcon("B Queen.png"));
                        }
                    } else if (model.pieceAt(row, col).type() == "King") {
                        if (model.pieceAt(row, col).player() == Player.WHITE) {
                            board[row][col].setIcon(new ImageIcon("R King.png"));
                        } else {
                            board[row][col].setIcon(new ImageIcon("B King.png"));
                        }
                    }

                }


            }
        }


    }

    // add other helper methods as needed

    // inner class that represents action listener for buttons
    private class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            for (int row = 0; row < model.getNumRows(); row++) {
                for (int col = 0; col < model.getNumCol(); col++) {
                    if (board[row][col] == event.getSource()) {
                    }


                }
            }
        }
    }


}

