package soloworld.scalar.intermediate.carryForward;

/**
 * You have given a string A having Uppercase English letters.
 *
 * You have to find how many times subsequence "AG" is there in the given string.
 *
 * NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
 *
 * Input 1:
 *
 *  A = "ABCGAG"
 * Input 2:
 *
 *  A = "GAB"
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  3
 * Output 2:
 *
 *  0
 */
public class MaximumSubString {
        public final int M = 1000000007;

    public int solve(String A) {
        int result =0;
        char[] array = A.toCharArray();
        int count =0;
        for(int i= array.length-1; i>=0;i--) {
            if(array[i]== 'G') {
                count++;
            }
            if(array[i]=='A') {
                result=((result%M)+ (count%M))%M;
            }
        }
        return  result;
    }
}
