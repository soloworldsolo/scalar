package soloworld.leetcode.arary;

import java.util.Arrays;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] result = new int[intervals.length][intervals[0].length];
        int start = intervals[0][0];
        int end = intervals[0][1];
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {


            int currstart = intervals[i][0];
            int currend = intervals[i][1];

            if (currstart <= end) {
                end = Math.max(end, currend);
            } else {
                result[count][0] = start;
                result[count++][1] = end;
                start = currstart;
                end = currend;
            }

        }
        result[count][0] = start;
        result[count++][1] = end;
        int[][] res = new int[count][2];

        for (int i = 0; i < res.length; i++) {

            res[i][0] = result[i][0];
            res[i][1] = result[i][1];
        }

        return res;

    }
}
