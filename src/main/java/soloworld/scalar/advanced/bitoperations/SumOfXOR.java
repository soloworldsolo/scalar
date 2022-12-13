package soloworld.scalar.advanced.bitoperations;

/**
 * Given an array A of N integers. Find the sum of bitwise XOR all pairs of numbers in the array.
 * <p>
 * Since the answer can be large, return the remainder after the dividing the answer by 109+7.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * <p>
 * 1 <= A[i] < 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * Only argument A is an array of integers
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the sum of xor of all pairs of number in the array.
 */
public class SumOfXOR {
    public int solve(int[] A) {
        int mod = 1000000007;
        long result = 0;
        for (int i = 0; i < 32; i++) {
            long setBIts = 0;
            long unsetBits = 0;
            for (int j = 0; j < A.length; j++) {


                if (isBitSet(A[j], i)) {
                    setBIts++;
                } else {
                    unsetBits++;
                }

            }
            result += (setBIts * unsetBits) * (1 << i);
            result %= mod;
        }
        return ((int) result % mod);
    }

    private boolean isBitSet(int A, int index) {
        return (A & (1 << index)) != 0;
    }
}
