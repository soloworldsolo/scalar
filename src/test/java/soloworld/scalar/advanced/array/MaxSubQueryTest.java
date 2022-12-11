package soloworld.scalar.advanced.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaxSubQueryTest {


    @Test
    void test1() {
        var input = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        var x = new int[]{1, 2};
        var y = new int[]{1, 2};
        var z = new int[]{2, 3};
        var d = new int[]{2, 3};

        MaxSubQuery maxSubQuery = new MaxSubQuery();
        int[] res = maxSubQuery.solve(input, x, y, z, d);

        assertArrayEquals(res, new int[]{12, 28});
    }
}