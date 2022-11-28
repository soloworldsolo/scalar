package soloworld.scalar.advanced.array;

/**
 * Problem Description
 * Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 100000
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument is the vector A
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return one integer, the answer to the question
 */
public class RainWaterTapped {
    public int trap(final int[] A) {
        int[] prefixMaxArray = new int[A.length];
        int[] suffixMaxArray = new int[A.length];

        prefixMaxArray[0] = A[0];
        suffixMaxArray[A.length - 1] = A[A.length - 1];
        for (int i = 1; i < A.length; i++) {
            prefixMaxArray[i] = Math.max(A[i], prefixMaxArray[i - 1]);
        }

        for (int i = A.length-2; i >=0; i--) {
            suffixMaxArray[i] = Math.max(A[i], suffixMaxArray[i+1]);
        }

        int result = 0;

        for (int i = 1; i < A.length - 1; i++) {
            int capacity = Math.min(prefixMaxArray[i - 1], suffixMaxArray[i + 1]);
            int saved = capacity - A[i];

            if (saved > 0) {
                result += saved;
            }

        }

        return result;
    }

}
