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
public class Rook extends ChessPiece {
    protected Rook(Player player) {
        super(player);
    }

    @Override
    public String type() {
        return "Rook";
    }

    @Override
    public boolean isValidMove(Move move, IChessPiece[][] board) {
        boolean validMove = false;
        if(super.isValidMove(move, board)){
            if(move.toRow == move.fromRow+1){
                if(move.toColumn == move.fromColumn+1 || move.toColumn == move.fromColumn-1){
                    validMove = true;
                }
            }


        }
        return validMove;
    }
}
