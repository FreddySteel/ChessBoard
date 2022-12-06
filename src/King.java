public class King extends Piece {
    private boolean inCheck;

    public King (String position,boolean isBlack){
        super(position, isBlack);
        symbol = 'K';
        inCheck = false;

    }

    public boolean isValidMove (String targetPosition){
        //Check if the position is within one square of the starting position

        int currentRow = ChessUtils.getRowFromPosition(getPosition());
        int currentColoumn = ChessUtils.getColoumnFromPosition(getPosition());
        int targetRow=
        int targetColoum=;



    }
}
