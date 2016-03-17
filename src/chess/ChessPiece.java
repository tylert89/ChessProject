package chess;

/**
 * Created by tylerfaulk on 2/29/16.
 */
public abstract class ChessPiece implements IChessPiece {

    private Player owner;

    protected ChessPiece(Player player) {
        this.owner = player;
    }

    public abstract String type();

    public Player player() {
        // complete this
    }

    public boolean isValidMove(Move move, IChessPiece[][] board) {
        // complete this
    }
}

}

