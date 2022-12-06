public class Piece {
    private int row;
    private int coloumn;
    private boolean isBlack;
    protected char symbol;


    public Piece(int row, int coloumn, boolean isBlack) {
        this.row = row;
        this.coloumn = coloumn;
        this.isBlack = isBlack;
        symbol = 'x';

    }



    public Piece(String position, boolean isBlack){
        this.isBlack=isBlack;
        symbol = 'x';
        row = ChessUtils.getRowFromPosition(position);
        coloumn = ChessUtils.getColoumnFromPosition(position);
    }
// for a position A8 would return number 7



    public String getPosition() {
        return ChessUtils.coloumnToLetter(coloumn) + ChessUtils.rowToNumber(row);

    }


    public char getSymbol() {
        if (isBlack){
            return Character.toUpperCase(symbol);
        }
        return Character.toLowerCase(symbol);
    }
    public boolean isValidMove(String targetPosition){
        return true;
    }
}





