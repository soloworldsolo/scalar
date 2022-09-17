package soloworld.scalar.intermediate.prefixsum;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given an integer array A of length N.
 * You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
 * For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
 * More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * B = [[1, 4], [2, 3]]
 * Input 2:
 * <p>
 * A = [2, 2, 2]
 * B = [[1, 1], [2, 3]]
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1:
 * [10, 5]
 * Output 2:
 * <p>
 * [2, 4]
 */
public class RangeSum {

    public long[] rangeSum(int[] input, int[][] B) {
        long[] prefixArray = new long[input.length];
        long[] result = new long[B.length];
        prefixArray[0] = input[0];
        for (int i = 1; i < input.length; i++) {
            prefixArray[i] = input[i] + prefixArray[i - 1];
        }
        int resultIndex = 0;
        for (int[] inp : B) {
            int startIndex = inp[0] -1;
            int endIndx = inp[1]-1;
            if (startIndex == endIndx) {
                result[resultIndex++] = input[endIndx];
            } else {
                long start =startIndex ==0 ?0: prefixArray[startIndex -1];
                long end = prefixArray[endIndx];
                result[resultIndex++] = end - start;
            }


        }

        return result;
    }


}
