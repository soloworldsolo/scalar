package soloworld.scalar.intermediate.subarary;

/**
 * You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
 * But the sum must not exceed B.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 103
 * 1 <= B <= 109
 * 1 <= C[i] <= 106
 * <p>
 * <p>
 * Input Format
 * The first argument is the integer A.
 * The second argument is the integer B.
 * The third argument is the integer array C.
 * <p>
 * <p>
 * Output Format
 * Return a single integer which denotes the maximum sum.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = 5
 * B = 12
 * C = [2, 1, 3, 4, 5]
 * Input 2:
 * <p>
 * A = 3
 * B = 1
 * C = [2, 2, 2]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 12
 * Output 2:
 * <p>
 * 0
 */
public class MaximumSubArray {
    public int maxSubarray(int A, int B, int[] C) {
        int sum = 0;
        int result = 0;
        for (int i = 0; i < A; i++) {
            sum = 0;
            for (int j = i; j < A; j++) {
                sum += C[j];
                if (sum <= B) {
                    result = Math.max(sum, result);
                }
            }
        }
        return result;


    }
}
