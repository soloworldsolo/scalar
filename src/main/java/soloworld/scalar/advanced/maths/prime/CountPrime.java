package soloworld.scalar.advanced.maths.prime;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer A. Find the list of all prime numbers in the range [1, A].
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 106
 * A = 7
 * Input 2:
 * A = 12
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * [2, 3, 5, 7]
 * Output 2:
 * [2, 3, 5, 7, 11]
 */
public class CountPrime {
    public int[] solve(int A) {
        int[] isPrime = new int[A + 1];

        for (int i = 2; (i * i <= A); i++) {
            for (int j = i+1; j <= A; j++) {
                if (isPrime[j] == 0) {
                    if (j % i == 0) {
                        isPrime[j] = 1;
                    }
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i] == 0) {
                res.add(i);
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = res.get(i);
        }
        return result;
    }


}
