package soloworld.scalar.advanced.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaximumMaximSubQueryMatrixTest {

    @Test
    void test1() {
        var input = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        MaximumMaximSubQueryMatrix maximumMaximSubQueryMatrix = new MaximumMaximSubQueryMatrix();
        long res = maximumMaximSubQueryMatrix.solve(input);
        assertEquals(45, res);
    }
}