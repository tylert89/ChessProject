package chess;

/**
 * Created by tylerfaulk on 2/29/16.
 */
public class Knight extends ChessPiece {
    protected Knight(Player player) {
        super(player);
    }

    @Override
    public String type() {
        return "Knight";
    }

    @Override
    public boolean isValidMove(Move move, IChessPiece[][] board) {
        boolean validMove = false;
        if(super.isValidMove(move, board)){
            if(((move.toRow == move.fromRow+2)&&(move.toColumn == move.fromColumn+1))
                    || ((move.toRow == move.fromRow+2)&&(move.toColumn == move.fromColumn-1))
                    || ((move.toRow == move.fromRow-2)&&(move.toColumn == move.fromColumn+1))
                    || ((move.toRow == move.fromRow-2)&&(move.toColumn == move.fromColumn-1))
                    || ((move.toRow == move.fromRow+1)&&(move.toColumn == move.fromColumn+2))
                    || ((move.toRow == move.fromRow+1)&&(move.toColumn == move.fromColumn-2))
                    || ((move.toRow == move.fromRow-1)&&(move.toColumn == move.fromColumn+2))
                    || ((move.toRow == move.fromRow-1)&&(move.toColumn == move.fromColumn-2))){
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
