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
public class Pawn extends ChessPiece {

    protected Pawn(Player player) {
        super(player);
    }

    @Override
    public String type() {
        return "Pawn";
    }

    @Override
    public boolean isValidMove(Move move, IChessPiece[][] board) {
        boolean validMove = false;
        if(super.isValidMove(move, board)){
            if(move.toRow == move.fromRow+1){ //add code to allow for a two space move on the pawns first move
                if(move.toColumn == move.fromColumn){
                    validMove = true;
                }
            }

        }
        return validMove;
    }
}
