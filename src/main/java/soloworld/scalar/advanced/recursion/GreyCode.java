package soloworld.scalar.advanced.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * An n-bit gray code sequence is a sequence of 2n integers where:
 *
 * Every integer is in the inclusive range [0, 2n - 1],
 * The first integer is 0,
 * An integer appears no more than once in the sequence,
 * The binary representation of every pair of adjacent integers differs by exactly one bit, and
 * The binary representation of the first and last integers differs by exactly one bit.
 * Given an integer n, return any valid n-bit gray code sequence.
 */
public class GreyCode {
    public List<Integer> grayCode(int n) {
      List<Integer> res = new ArrayList<>();
      int limit = ((int) Math.pow(2,n)) ;

        for (int i = 0; i < limit; i++) {
            int num = i ^ i>>1;
            res.add(num);
        }

     return res;
    } public List<Integer> recursion(int n) {
      List<Integer> res = new ArrayList<>();
      helper(res,n);

     return res;
    }
int nextNum =0;
    private void helper(List<Integer> result, int n) {

        if (n == 0) {
            result.add(nextNum);
            return;
        }
        helper(result, n - 1);
        // Flip the bit at (n - 1)th position from right
        nextNum = nextNum ^ (1 << (n - 1));
        helper(result, n - 1);

    }
}
