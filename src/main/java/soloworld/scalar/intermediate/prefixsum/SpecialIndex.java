package soloworld.scalar.intermediate.prefixsum;

/**
 * Given an array, arr[] of size N, the task is to find the count of array indices
 * such that removing an element from these indices
 * makes the sum of even-indexed and odd-indexed array elements equal.
 * Input 1:
 * A=[2, 1, 6, 4]
 * <p>
 * Input 2:
 * <p>
 * A=[1, 1, 1]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 1
 * even [2,2,8,8]
 * odd[0,1,1,5]
 * Output 2:
 * <p>
 * 3
 */
public class SpecialIndex {

    public int specialIndex(int[] input) {
        int[] prefixArrayEven = new int[input.length];
        int[] prefixArrayodd = new int[input.length];
        prefixArrayEven[0] = input[0];
        prefixArrayodd[0] = 0;
        int count = 0;
        for (int i = 1; i < input.length; i++) {
            if ((i & 1) == 0) {
                prefixArrayEven[i] = prefixArrayEven[i - 1] + input[i];
                prefixArrayodd[i] = prefixArrayodd[i - 1];
            } else {
                prefixArrayEven[i] = prefixArrayEven[i - 1];
                prefixArrayodd[i] = prefixArrayodd[i - 1] + input[i];
            }
        }

        for (int i = 0; i < input.length; i++) {
            if (i == 0) {
                if (prefixArrayodd[input.length - 1] == (prefixArrayEven[input.length - 1] - input[0])) {
                     count++;
                }
            } else {
                int leftSum = prefixArrayodd[i - 1] + prefixArrayEven[prefixArrayEven.length - 1] - prefixArrayEven[i];
                int rightSum = prefixArrayEven[i - 1] + prefixArrayodd[prefixArrayodd.length - 1] - prefixArrayodd[i];

                if (leftSum == rightSum) {
                     count++;
                }
            }


        }

        return count;
    }
}
