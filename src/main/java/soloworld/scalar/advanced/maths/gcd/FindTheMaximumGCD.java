package soloworld.scalar.advanced.maths.gcd;

/*
   Given an integer array A of size N. You have to delete one element such that the
   GCD(Greatest common divisor) of the remaining array is maximum.

Find the maximum value of GCD.
 */
public class FindTheMaximumGCD {
    public int solve(int[] A) {
        int[] prefixGCD = new int[A.length];
        int[] suffixGCD = new int[A.length];
        prefixGCD[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefixGCD[i] = gcd(prefixGCD[i - 1], A[i]);
        }
        suffixGCD[A.length - 1] = A[A.length - 1];
        for (int i = A.length-2; i >=0 ; i--) {
            suffixGCD[i] = gcd(suffixGCD[i+1], A[i]);
        }
        int max = Math.max(prefixGCD[A.length -2],suffixGCD[1] );
        for (int i = 1; i < A.length-1; i++) {
            int calculatedSum = gcd(prefixGCD[i-1],suffixGCD[i+1] );
            max = Math.max(max,calculatedSum);
        }

      return max;
    }

    public int gcd(int num1, int num2) {
        if(num2 >num1) {
            gcd(num2, num1);
        }
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }


}
