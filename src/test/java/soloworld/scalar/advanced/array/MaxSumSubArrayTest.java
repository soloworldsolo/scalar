package soloworld.scalar.advanced.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxSumSubArrayTest {

    @Test
    public void test() {

        var input = new int[] {1, 2, 3, 4, -10};

        MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
        int res = maxSumSubArray.maxSubArray(input);
        assertEquals(res,10);

    }

}