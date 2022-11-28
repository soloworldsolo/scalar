package soloworld.scalar.arrays;

/**
 * ittle Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the array equal to -1.
 * <p>
 * He wants your help in finding out the minimum number of operations required such that the maximum element of the resulting array is B. If it is not possible, then return -1.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= |A| <= 105
 * <p>
 * 1 <= A[i] <= 109
 */
public class LittlePony {
    public int solve(int[] A, int B) {
        int count = 0;
        boolean isExists = false;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > B) {
                ++count;
            }
            if (A[i] == B) {
                isExists = true;
            }

        }

        if (isExists) {
            return count;
        }
        return -1;


    }
}
