package soloworld.scalar.advanced.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumOfSubArrayMatrixTest {

    @Test
    void test1() {
        var input = new int[][] {{1,1},{1,1}};
        SumOfSubArrayMatrix sumOfSubArrayMatrix = new SumOfSubArrayMatrix();
        int res = sumOfSubArrayMatrix.solve(input);
        assertEquals(16, res);

    }
}