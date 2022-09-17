package soloworld.scalar.intermediate.carryForward;

/**
 * Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
 * <p>
 * and at least one occurrence of the minimum value of the array.
 * Input 1:
 * <p>
 * A = [1, 3]
 * Input 2:
 * <p>
 * A = [2]
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1:
 * <p>
 * 2
 * Output 2:
 * <p>
 * 1
 */
public class SubArrayMaxValue {
    public int solve(int[] A) {
        if (A.length == 1) {
            return 1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];

            }
            if (A[i] > max) {
                max = A[i];
            }

        }
        int res = A.length;
        int minIndex = -1;
        int maxIndex = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == max) {
                maxIndex = i;

                if (minIndex != -1) {
                    int maxValue = Math.max(i,minIndex);
                    int minVAlue = Math.min(minIndex,i);
                    res = Math.min(maxValue - minVAlue + 1, res);
                }
            }  if (A[i] == min) {
                minIndex = i;
                if (maxIndex != -1) {
                    int maxValue = Math.max(i,maxIndex);
                    int minVAlue = Math.min(maxIndex,i);
                    res = Math.min(maxValue - minVAlue + 1, res);
                }
            }
        }
        return res;

    }

}



