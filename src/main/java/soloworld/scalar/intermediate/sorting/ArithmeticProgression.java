package soloworld.scalar.intermediate.sorting;

import java.util.Arrays;

/**
 * Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.
 *
 * A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
 *
 *
 *
 * Problem Constraints
 * 2 <= N <= 105
 *
 * -109 <= A[i] <= 109
 *
 *
 *
 * Input Format
 * The first and only argument is an integer array A of size N.
 *
 *
 *
 * Output Format
 * Return 1 if the array can be rearranged to form an arithmetic progression, otherwise return 0.
 */
public class ArithmeticProgression {
    public int solve(int[] A) {
        if(A.length ==0) {
            return  0;
        }
        Arrays.sort(A);
        int progression = A[1] -A[0];
        for (int i=2;i<A.length;i++) {
            int currentProgression = A[i] -A[i-1];
            if(progression != currentProgression) {
                return  0;
            }
        }

        return  1;
    }
}
