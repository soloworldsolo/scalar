package soloworld.scalar.intermediate.subarary;

/**
 * Problem Description
 * Given an array of size N, find the subarray of size K with the least average.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1<=k<=N<=1e5
 * -1e5<=A[i]<=1e5
 * <p>
 * <p>
 * Input Format
 * First argument contains an array A of integers of size N.
 * Second argument contains integer k.
 * <p>
 * <p>
 * Output Format
 * Return the index of the first element of the subarray of size k that has least average.
 * Array indexing starts from 0.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A=[3, 7, 90, 20, 10, 50, 40]
 * B=3
 * Input 2:
 * <p>
 * A=[3, 7, 5, 20, -10, 0, 12]
 * B=2
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 3
 * Output 2:
 * <p>
 * 4
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * Subarray between indexes 3 and 5
 * The subarray {20, 10, 50} has the least average
 * among all subarrays of size 3.
 * Explanation 2:
 * <p>
 * Subarray between [4, 5] has minimum average
 */
public class SubArrayWithLeastAvg {
    public int solve(int[] A, int B) {
        int startIndex = 0;
        int endEndIndex = B-1;
        int maxIndex = A.length -B ;
        int sum = 0;
        int result =0;
        int[] prefixArray = new int[A.length];
        prefixArray[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefixArray[i] = prefixArray[i-1] + A[i];
        }
        sum = prefixArray[B-1];
        while (startIndex< maxIndex) {
           int localSum =prefixArray[++endEndIndex] - prefixArray[startIndex++];
            if(localSum < sum) {
                sum = localSum;
                result =startIndex;
            }
        }
        return result;
    }

}
