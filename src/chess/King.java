package chess;

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
        //fix in step 8
        return validMove;
    }
}
