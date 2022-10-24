package soloworld.scalar.intermediate.matrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColumnSumTest {

    private ColumnSum columnSum;


    @BeforeEach
    void setUp() {
        columnSum = new ColumnSum();
    }

    @Test
    void test1() {
        var input = new int[][] {{1,2,3,4},{5,6,7,8},{9,2,3,4}};

        int[] res = columnSum.solve(input);

        assertArrayEquals(res , new int[]{15,10,13,16});
    }
}