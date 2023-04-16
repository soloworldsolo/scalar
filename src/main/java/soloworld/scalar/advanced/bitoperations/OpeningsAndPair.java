package soloworld.scalar.advanced.bitoperations;

import java.util.ArrayList;

/**
 * Problem Description
 * <p>
 * Given an array A. For every pair of indices i and j (i != j), find the maximum A[i] & A[j].
 * <p>
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= len(A) <= 105
 * 1 <= A[i] <= 109
 * <p>
 * <p>
 * Input Format
 * <p>
 * The first argument is an integer array A.
 * <p>
 * <p>
 * Output Format
 * <p>
 * Return a single integer that is the maximum A[i] & A[j].
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1:-
 * A = [53, 39, 88]
 * Input 2:-
 * A = [38, 44, 84, 12]
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1:-
 * 37
 * Output 2:-
 * 36
 * <p>
 * <p>
 * Example Explanation
 * <p>
 * Explanation 1:-
 * 53 & 39 = 37
 * 39 & 88 = 0
 * 53 & 88 = 16
 * Maximum among all these pairs is 37
 * Explanation 2:-
 * Maximum bitwise and among all pairs is (38, 44) = 36
 */
public class OpeningsAndPair {

    public int solve(ArrayList<Integer> A) {

        int answer = 0;
        for (int i = 31; i >=0; i--) {
            int count = 0;
            for (int j = 0; j < A.size(); j++) {

                if (isBitSet(A.get(j), i)) {
                    count++;
                }

            }
           // if count is greater than equal to 2 set all the numbers which are unset at this position to zero

            if(count >=2) {
                //answer + 1<<i
                answer =answer | ( 1<<i);

                for (int j = 0; j < A.size(); j++) {
                    if (!isBitSet(A.get(j),i)) {
                        A.set(j,0);
                    }
                }
            }
        }

        return answer;

    }

    private boolean isBitSet(int A, int index) {
        return (A & (1 << index)) != 0;
    }

}
