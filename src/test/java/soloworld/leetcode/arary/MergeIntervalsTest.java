package soloworld.leetcode.arary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeIntervalsTest {


    @Test
    void test1() {
        var input = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        var mergeIntervals = new MergeIntervals();
        int[][] merge = mergeIntervals.merge(input);

        assertArrayEquals(merge, new int[][]{{1, 6}, {8, 10}, {15, 18}});

    }

    @Test
    void test2() {
        var input = new int[][]{{1, 4}, {4, 5}};
        var mergeIntervals = new MergeIntervals();
        int[][] merge = mergeIntervals.merge(input);

        assertArrayEquals(merge, new int[][]{{1, 5}});

    }
}