package chess;

/**
 * Created by tylerfaulk on 2/29/16.
 */
public class ChessModel implements IChessModel {
    private IChessPiece[][] board;
    private Player player;
    private int numRows; //height of board
    private int numCol; // width of board



    public ChessModel() {
        numRows = 8; //defualt value, change when implementing GUI user input
        numCol = 8; //defualt value, change when implementing GUI user input
        //instantiate player?
        board = new IChessPiece[numRows][numCol]; // i assume we have to do this

        board[0][0] = new Rook(player.WHITE);     // adding all of the pieces onto the board
        board[0][1] = new Knight(player.WHITE);
        board[0][2] = new Bishop(player.WHITE);
        board[0][3] = new King(player.WHITE);
        board[0][4] = new Queen(player.WHITE);
        board[0][5] = new Bishop(player.WHITE);
        board[0][6] = new Knight(player.WHITE);
        board[0][7] = new Rook(player.WHITE);

        board[7][0] = new Rook(player.BLACK);
        board[7][1] = new Knight(player.BLACK);
        board[7][2] = new Bishop(player.BLACK);
        board[7][3] = new King(player.BLACK);
        board[7][4] = new Queen(player.BLACK);
        board[7][5] = new Bishop(player.BLACK);
        board[7][6] = new Knight(player.BLACK);
        board[7][7] = new Rook(player.BLACK);

        for (int col = 0; col < numCol; col++){
            board[1][col] = new Pawn(player.BLACK);
            board[6][col] = new Pawn(player.WHITE);
        }






    }

    public boolean isComplete() {
        return false;
        // FIXME: 3/17/2016 step 10
    }

    public boolean isValidMove(Move move) {
        boolean validMove = false;
        if(board[move.fromRow][move.fromColumn].isValidMove(move, board)){ //i have no idea what this is doing or if it works
           validMove = true;
        }
        return validMove;
    }

    public void move(Move move) {
        if(isValidMove(move)){ //not sure if condition is necessary
            board[move.fromRow][move.fromColumn] = board[move.toRow][move.toColumn];
        }
        else{
            System.out.println("move is not valid"); // remove if condition is not necessary
        }
    }

    public boolean inCheck(Player p) {
        return false;
        // FIXME: 3/17/2016 step 9
    }

    public Player currentPlayer() {
        return player;
    }

    public int numRows() {
        return numRows;
    }

    public int numColumns() {
        return numCol;
    }

    public Player getPlayer() {
        return player; // same as currentPlayer()
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumCol() {
        return numCol;
    }

    public void setNumCol(int numCol) {
        this.numCol = numCol;
    }

    public IChessPiece pieceAt(int row, int col) {
        return board[row][col];

    }

    public IChessPiece[][] getBoard() {
        return board;
    }

    public void setBoard(IChessPiece[][] board) {
        this.board = board;
    }


}
