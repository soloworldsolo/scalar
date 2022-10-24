package soloworld.scalar.intermediate.matrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpiralFillTest {

    private SpiralFill spiralFill;

    @BeforeEach
    void setUp() {
        spiralFill = new SpiralFill();
    }

    @Test
    void test1() {
        int[][] ints = spiralFill.generateMatrix(3);
        assertArrayEquals(new int[][]{{1,2,3},{8,9,4},{7,6,5}},ints );
    }

    @Test
    void test_Input_5() {
        int[][] ints = spiralFill.generateMatrix(5);
        assertArrayEquals(new int[][]{{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14, 23, 22, 21, 8},{13, 12, 11, 10, 9}},ints );
    }
}