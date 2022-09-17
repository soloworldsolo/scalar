package soloworld.scalar.intermediate.prefixsum;

/**
 * Given an array A of size N. You will be given M queries to process. Each query will be of the form B[i][0] B[i][1].
 * <p>
 * If the subarray from B[i][0] to B[i][1] is non decreasing, the output should be 1 else output should be 0.
 * <p>
 * Return an array of integers answering each query.
 * <p>
 * nput 1:
 * A = [1, 7, 3, 4, 9]
 * B = [
 * [0, 1],
 * [1, 4]
 * ]
 * Input 2:
 * A = [1, 1, 7, 2, 3]
 * B = [
 * [0, 2],
 * [2, 4]
 * ]
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1 :
 * [1, 0]
 * Output 2 :
 * [1, 0]
 */
public class IncreasingSubArray {
    public int[] solve(int[] input, int[][] range) {
        int[] res = new int[range.length];
        long[] prefix = new long[input.length];
        prefix[0] = input[0];
        for (int i = 1; i < input.length; i++) {
            prefix[i] = input[i] + prefix[i - 1];
        }
        int resIndex=0;
        for (int[] freq : range) {
            int startIndex = freq[0];
            int endIndex = freq[1];
            if (startIndex == endIndex) {
                   res[resIndex++] =1;
            }else {
                long localRes =0;
                long startValue =0;
                if(startIndex ==0) {
                    startValue = prefix[0];
                    localRes = prefix[endIndex];
                }else {
                     startValue =  (prefix[startIndex] - prefix[startIndex-1]);
                   long endValue = prefix[endIndex];
                     localRes = endValue -startValue;

                }
                long frequency = (endIndex -startIndex)+1;
                int sol =  localRes >startValue *frequency  ?1 :0;
                  res[resIndex++] = sol;

            }
        }
        return res;
    }

    public int[] solveBruteForce(int[] input, int[][] range) {
        int[] res = new int[range.length];
        int resIndex=0;
        for(int[] rang: range) {
            boolean isIncreasing = true;
            int start = rang[0];
            int end = rang [1];
            if(start!= end) {
                for(int i= start+1;i<=end;i++) {
                    if(input[i] < input[i-1]) {
                        isIncreasing = false;
                        break;
                    }
                }
            }
            res[resIndex++] = isIncreasing?1:0;
        }
        return res;
    }
}
