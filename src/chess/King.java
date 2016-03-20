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
public class King extends ChessPiece {
    protected King(Player player) {
        super(player);
    }

    @Override
    public String type() {
        return "King";
    }

    @Override
    public boolean isValidMove(Move move, IChessPiece[][] board) {
        boolean validMove = false;
        if(super.isValidMove(move, board)){
            if((move.toRow == move.fromRow+1)||(move.toRow == move.fromRow-1)
                    || (move.toColumn == move.fromColumn+1)||(move.toColumn == move.fromColumn-1)
                    || ((move.toRow == move.fromRow+1)&&(move.toColumn == move.fromColumn+1))
                    || ((move.toRow == move.fromRow+1)&&(move.toColumn == move.fromColumn-1))
                    || ((move.toRow == move.fromRow-1)&&(move.toColumn == move.fromColumn+1))
                    || ((move.toRow == move.fromRow-1)&&(move.toColumn == move.fromColumn-1))){
                //We may want to shorten this if with probable a loop
                if(move.toColumn == move.fromColumn){
                    validMove = true;
                }
                //Test
            }

        }
        return validMove;
    }
}
