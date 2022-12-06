public class ChessUtils{
    public static int getColoumnFromPosition(String p) {
        char colChar=p.toCharArray()[0];
        int asciiValue = colChar;
        int colNumber= asciiValue - (int)'A';
        return colNumber;
    }

    public static String coloumnToLetter(int c) {
        char letter = (char) ('A' + c);
        return Character.toString(letter);
    }
    public static String rowToNumber(int r) {
        return Integer.toString(r + 1);
    }

    public static int getRowFromPosition(String p) {
        char posChar = p.toCharArray()[1];// A8 ---> 8
        int rowNumber = Character.getNumericValue(posChar);
        return rowNumber -1;
    }
}

