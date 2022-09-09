package edu.wofford;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
    @Test
    public void testGetWinnerAtBeginning() {
        TicTacToe t = new TicTacToe();
        TicTacToe.Result r = t.getWinner();
        assertEquals(TicTacToe.Result.NONE, r);
    }

    @Test
    public void testPutXInUpperLeft() {
        TicTacToe t = new TicTacToe();
        boolean marked = t.setMark(0, 0, TicTacToe.Mark.X);
        assertTrue(marked);
        TicTacToe.Mark m = t.getMark(0, 0);
        assertEquals(TicTacToe.Mark.X, m);
    }

}
