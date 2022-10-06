package soloworld.scalar.intermediate.modular;

/**
 * You are given a number A in the form of a string. Check if the number is divisible by eight or not.
 *
 * Return 1 if it is divisible by eight else, return 0.
 */
public class NumberDivisibleByEight {
    public int solve(String A) {
       if(A.length() <=3) {
           return Integer.parseInt(A) %8 ==0 ? 1:0;
       }
       int val = Integer.parseInt(A.substring(A.length()-4));
       return val %8==0 ?1 :0;
    }
}
