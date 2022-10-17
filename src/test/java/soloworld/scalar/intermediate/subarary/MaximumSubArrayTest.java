package soloworld.scalar.intermediate.subarary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubArrayTest {

    @Test
    void name() {
        var input = new int[] {1,3,4,5,2};
        int res = new MaximumSubArray().maxSubarray(5, 12, input);
        assertEquals(12,res);
    }
    @Test
    void name1() {
        var input = new int[] {2,2,2};
        int res = new MaximumSubArray().maxSubarray(3, 1, input);
        assertEquals(0,res);
    }
    @Test
    void name11() {
        var input = new int[] {68, 79, 15, 4, 69, 21, 33, 94, 84, 82, 59, 30, 4, 22, 59, 23, 78, 61, 12, 89, 58, 57, 60, 19, 62, 93, 13, 25, 23, 26, 36, 60, 39, 83, 98, 100, 98, 34, 94, 29, 94, 62, 8, 73, 13, 20, 92, 77, 41, 47, 11, 87, 74, 80, 35, 61, 8, 10, 86, 97, 69, 47, 80, 100 };
        int res = new MaximumSubArray().maxSubarray(64, 6786, input);
        assertEquals(3465,res);
    }

    @Test
    void name111() {
        var input = new int[] { 68, 39, 12, 51, 52, 39, 58, 12, 74, 78, 49, 41, 25, 44, 49, 40, 41, 94, 37, 92, 15, 23, 6, 6, 85, 99, 34, 23, 94, 49, 94, 89, 65, 64, 53, 21, 24, 90, 22, 100, 34, 20, 73, 10, 14, 50, 75, 47, 79, 43, 93, 10, 72, 10, 20, 96, 11, 85, 47, 9, 39, 91, 68, 86, 4, 5, 72, 59, 37, 50, 62, 37, 64, 7, 96, 72, 64, 73, 67, 51, 8, 34, 24, 5, 28, 88, 100, 52, 82, 30, 28, 61, 88, 89, 42};
        int res = new MaximumSubArray().maxSubarray(95, 1711, input);
        assertEquals(1711,res);
    }
}