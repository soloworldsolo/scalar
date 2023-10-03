package soloworld.scalar.lld.multithreading.systemdesign;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    private TicTacToe ticTacToe;

    @BeforeEach
    void setUp() {
        ticTacToe = new TicTacToe();
    }

    @Test()
    @DisplayName("player 1 wins the game")
    void test() {
        var input = new int[][] {{0,0} ,{2,0},{1,1},{2,1},{2,2}};
        String res = ticTacToe.tictactoe(input);
        assertEquals(res ,"A wins");
    }
    @Test
    @DisplayName("player 2 wins the game")
    void test1() {
        var input = new int[][] {{0,0} ,{2,0},{1,1},{2,1},{2,2}};
        String res = ticTacToe.tictactoe(input);
        assertEquals(res ,"A wins");
    }
@Test
    @DisplayName("Match draws")
    void test2() {
        var input = new int[][] {{0,0} ,{1,1},{1,0},{2,0},{2,2}};
        String res = ticTacToe.tictactoe(input);
        assertEquals(res ,"Draw");
    }


}