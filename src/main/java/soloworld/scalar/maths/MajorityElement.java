package soloworld.scalar.maths;

/**
 * Problem Description
 * You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
 * If so, return the integer. If not, return -1.
 * <p>
 * If there are multiple solutions, return any one.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 7*105
 * 1 <= A[i] <= 109
 * <p>
 * <p>
 * Input Format
 * The only argument is an integer array A.
 */
public class MajorityElement {

    public int repeatedNumber(int[] A) {

        int counter1 = 0;
        int counter2 = 0;
        int result1 = Integer.MAX_VALUE;
        int result2 = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == result1) {
                counter1++;
            } else if (A[i] == result2) {
                counter2++;
            }
            else if (counter1 == 0) {
                result1 = A[i];
                counter1 = 1;
            } else if (counter2 == 0) {
                result2 = A[i];
                counter2 = 1;
            } else {
                counter2--;
                counter1--;

            }
        }


        counter1 = 0;
        counter2 =0;
        for (int j = 0; j < A.length; j++) {
            if (A[j] == result1) {
                counter1++;
            }
            if (A[j] == result2) {
                counter2++;
            }
        }

        if (counter1 > (A.length) / 3) {
            return result1;
        }
        if (counter2 > (A.length) / 3) {
            return result2;
        }
        return -1;

    }

}
