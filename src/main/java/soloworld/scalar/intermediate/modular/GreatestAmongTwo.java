package soloworld.scalar.intermediate.modular;

/**
 * Problem Description
 * Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.
 *
 *
 *
 * Problem Constraints
 * 1 <= A, B <= 109
 * A != B
 */
public class GreatestAmongTwo {
    public int solve(int A, int B) {
        if(A> B) {
            solve(B ,A);
        }

        return Math.abs(B-A);


    }
}
