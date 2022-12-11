package soloworld.scalar.advanced.array;

/**
 * Problem Description
 * Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 1e6
 * -1000 <= A[i] <= 1000
 *
 *
 *
 * Input Format
 * The first and the only argument contains an integer array, A.
 *
 *
 *
 * Output Format
 * Return an integer representing the maximum possible sum of the contiguous subarray.
 */
public class MaxSumSubArray {
    public int maxSubArray(final int[] A) {
        int result = A[0];
        int sum = A[0];

        for(int i=1;i< A.length;i++) {
            if(A[i] > result+A[i]) {
                result = A[i];
            }else {
                result += A[i];
            }

            if(result > sum) {
                sum = result;
            }
        }


        return sum ;
    }
}
