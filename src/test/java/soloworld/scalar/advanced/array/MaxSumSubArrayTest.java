package soloworld.scalar.advanced.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSumSubArrayTest {

    @Test
    public void test() {

        var input = new int[]{1, 2, 3, 4, -10};

        MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
        int res = maxSumSubArray.maxSubArray(input);
        assertEquals(res, 10);

    }

    @Test
    public void test1() {

        var input = new int[]{-89, -277, -475, -480, -420};

        MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
        int res = maxSumSubArray.maxSubArray(input);
        assertEquals(res, -89);

    }

}