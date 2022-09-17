package soloworld.scalar.intermediate.prefixsum;

/**
 * You are given an array A of integers of size N.
 *
 * Your task is to find the equilibrium index of the given array
 *
 * The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 *
 * NOTE:
 *
 * Array indexing starts from 0.
 * If there is no equilibrium index then return -1.
 * If there are more than one equilibrium indexes then return the minimum index.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 * -105 <= A[i] <= 105
 *
 * Input 1:
 * A=[-7, 1, 5, 2, -4, 3, 0]
 * Input 2:
 *
 * A=[1,2,3]
 */
public class EqulibirumIndex {

    public int findEquilibriumIndex(int[] input) {

        int[] prefixArray = new int[input.length];
        prefixArray[0] = input[0];
         for(int i=1;i<input.length;i++) {
             prefixArray[i] = input[i] +prefixArray[i-1];
         }

         for(int i=0;i<input.length;i++) {
             int leftSum =0;
             int rightSum=0;

             if(i>0) {
                 leftSum = prefixArray[i-1];
             }

             rightSum = prefixArray[input.length-1]- prefixArray[i];

             if(leftSum == rightSum) {
                 return i;
             }
         }
        return -1;
    }
}
