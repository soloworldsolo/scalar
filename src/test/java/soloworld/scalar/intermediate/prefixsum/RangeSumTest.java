package soloworld.scalar.intermediate.prefixsum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumTest {

    private RangeSum rangeSum;

    @BeforeEach
    void setUp() {
        rangeSum = new RangeSum();
    }

    @Test
    void test1() {
        var input =new int[] {1,2,3,4,5};
        var input2 =new int[][] {{1,4},{2,3}};

        long[] longs = rangeSum.rangeSum(input, input2);
        assertArrayEquals(longs, new long[]{10,5});
    }


    @Test
    void test2() {
        var input =new int[] {2,2,2};
        var input2 =new int[][] {{1,1},{2,3}};

        long[] longs = rangeSum.rangeSum(input, input2);
        assertArrayEquals(longs, new long[]{2,4});
    }

    @Test
    void test3() {
        var input =new int[] {45987, 31653, 86838, 41659, 817, 19032, 42913, 85283, 11180, 47928, 85302, 47621, 76705, 67093, 67163, 74353, 82250, 73584, 19692, 77514, 93476, 19363, 91291, 42045, 46078, 76910, 77810, 67263, 87213, 75039, 19380, 9699, 41372, 60317, 33153, 9492, 93569, 77617, 5880, 16213, 55851, 30386, 45687, 87411, 22935, 51404, 49821, 47683, 91554, 86476, 64209, 19453, 71577, 56714, 28540, 21845, 56876, 51315, 96016};
        var input2 =new int[][] {{9,9}};

        long[] longs = rangeSum.rangeSum(input, input2);
        assertArrayEquals(longs, new long[]{11180});
    }
}