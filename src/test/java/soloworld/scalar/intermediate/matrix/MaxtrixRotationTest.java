package soloworld.scalar.intermediate.matrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxtrixRotationTest {

   private  MaxtrixRotation maxtrixRotation;
    @BeforeEach
    void setUp() {
        maxtrixRotation = new MaxtrixRotation();
    }

    @Test
    void test1() {
        var input = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int[][] rotate = maxtrixRotation.rotate(input);

        assertArrayEquals(new int[][]{{7,4,1},{8,5,2},{9,6,3}},rotate);
    }

    @Test
    void test_fail_1() {
        var input =new int[][] {{1,2},{3,4}};
        int[][] diagonal = maxtrixRotation.rotate(input);
        assertArrayEquals(new int[][]{{3,1},{4,2}},diagonal);
    }
}