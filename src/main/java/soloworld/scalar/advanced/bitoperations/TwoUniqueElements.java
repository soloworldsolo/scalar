package soloworld.scalar.advanced.bitoperations;

/**
 * Problem Description
 * Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
 * Find the two integers that appear only once.
 * <p>
 * Note: Return the two numbers in ascending order.
 * <p>
 * <p>
 * Problem Constraints
 * 2 <= |A| <= 100000
 * 1 <= A[i] <= 109
 */
public class TwoUniqueElements {
    public int[] solve(int[] A) {

        int combinedResult = 0;

        for (int num : A) {
            combinedResult ^= num;
        }

        int pos = 0;

        for (int i = 0; i < 32; i++) {

            if (isBitSet(combinedResult, i)) {
                pos = i;
                break;
            }
        }

        int num1 = 0;
        int num2 = 0;

        for (int number : A) {
            if (isBitSet(number, pos)) {
                num1 ^= number;
            } else {
                num2 ^= number;
            }
        }
        return new int[]{Math.min(num1, num2), Math.max(num1, num2)};
    }


    private boolean isBitSet(int A, int index) {
        return (A & (1 << index)) != 0;
    }
}
