package soloworld.scalar.intermediate.prefixsum;

/**
 * You are given an integer array A of size N.
 *
 * You have to pick B elements in total. Some (possibly 0) elements from left end of array A and some (possibly 0) from the right end of array A to get the maximum sum.
 *
 * Find and return this maximum possible sum.
 *
 * NOTE: Suppose B = 4, and array A contains 10 elements, then
 *
 * You can pick the first four elements or can pick the last four elements, or can pick 1 from front and 3 from the back, etc. You need to return the maximum possible sum of elements you can pick.
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 *
 * 1 <= B <= N
 *
 * -103 <= A[i] <= 103
 *
 *
 *
 * Input Format
 * First argument is an integer array A.
 *
 * Second argument is an integer B.
 *
 *
 *
 * Output Format
 * Return an integer denoting the maximum possible sum of elements you picked.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [5, -2, 3 , 1, 2]
 *  pre=[5,3,6,7,9]
 *  B = 3
 * Input 2:
 *
 *  A = [1, 2]
 *  B = 1
 *

 * Example Output
 * Output 1:
 *
 *  8
 * Output 2:
 *
 *  2
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Pick element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
 * Explanation 2:
 *
 *  Pick element 2 from end as this is the maximum we can get
 */
public class PickFronBOthSides {

    public int findMaxElements(int[] input , int index) {
        int[] prefixArray = new int[input.length];
        prefixArray[0] = input[0];
        for(int i=1;i<input.length;i++) {
            prefixArray[i] = input[i] +prefixArray[i-1];
        }
        if(index == input.length) {

            return prefixArray[input.length-1];

        }
       int leftSum = prefixArray[index-1] ;
        int currentSum = leftSum;
       int sum = leftSum;
       int j= input.length -1;
        for(int i=index-1;i>=0;i--) {
            currentSum = currentSum + (input[j] - input[i]);
         j--;
         sum = Math.max(currentSum,sum);
        }


        return  sum;
    }
}


