package soloworld.scalar.intermediate.subarary;

/**
 * ou are given an integer array A of length N.
 * You have to find the sum of all subarray sums of A.
 * More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
 * A subarray sum denotes the sum of all the elements of that subarray.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= Ai <= 10 4
 *
 *
 * Input Format
 * The first argument is the integer array A.
 *
 *
 * Output Format
 * Return a single integer denoting the sum of all subarray sums of the given array.
 *
 *
 * Example Input
 * Input 1:
 * A = [1, 2, 3]
 *
 *
 * 20
 */
public class SumOfSubArray {

    public long subarraySum(int[] A) {
          long sum=0;
          int index =0;
          for(int elem:A) {
              sum += (long) elem* ((index+1) * (A.length - (index)));
              index++;
          }
          return sum;
    }
}
