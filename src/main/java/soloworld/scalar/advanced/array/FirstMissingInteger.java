package soloworld.scalar.advanced.array;

/**
 * Problem Description
 * Given an unsorted integer array, A of size N. Find the first missing positive integer.
 *
 * Note: Your algorithm should run in O(n) time and use constant space.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 1000000
 *
 * -109 <= A[i] <= 109
 *
 *
 *
 * Input Format
 * First argument is an integer array A.
 *
 *
 *
 * Output Format
 * Return an integer denoting the first missing positive integer.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * [1, 2, 0]
 * Input 2:
 *
 * [3, 4, -1, 1]
 * Input 3:
 *
 * [-8, -7, -6]
 *
 *
 * Example Output
 * Output 1:
 *
 * 3
 * Output 2:
 *
 * 2
 * Output 3:
 *
 * 1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * A = [1, 2, 0]
 * First positive integer missing from the array is 3.
 */
public class FirstMissingInteger {
    public int firstMissingPositive(int[] A) {
        int result =0;
        int range = A.length;
        for (int i = 0; i < A.length; i++) {

            while (A[i] >=1 && A[i] <= range && A[i] !=(i+1) && A[i] != A[A[i]-1]) {

                swap(A, i );
            }

        }

        for (int i = 0; i < A.length; i++) {
            if(A[i] != i+1) {
                return i+1;
            }
        }
        return range+1;
    }

    private void swap(int[] a, int i) {
        int temp = a[i];
        int index = temp -1;
        int val = a[index];
        a[index] = a[i];
        a[i] = val;

    }

}
