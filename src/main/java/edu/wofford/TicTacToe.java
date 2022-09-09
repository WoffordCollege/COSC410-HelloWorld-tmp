package edu.wofford;

public class TicTacToe {
    public enum Result { NONE, XWINS, OWINS, TIE };
    public enum Mark { EMPTY, X, O };

    public TicTacToe() {

    }

    public Result getWinner() {
        return Result.TIE;
    }

    public Mark getMark(int row, int col) {
        return Mark.EMPTY;
    }

    public boolean setMark(int row, int col, Mark m) {
        return false;
    }
}
