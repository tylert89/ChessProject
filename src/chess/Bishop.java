package chess;

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
public class Bishop extends ChessPiece {
    protected Bishop(Player player) {
        super(player);
    }

    @Override
    public String type() {
        return "Bishop";
    }

    @Override
    public boolean isValidMove(Move move, IChessPiece[][] board) {
        boolean validMove = false;
        //fix in step 8
        return validMove;
    }
}
