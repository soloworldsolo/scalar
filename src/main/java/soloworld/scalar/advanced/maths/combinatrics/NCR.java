package soloworld.scalar.advanced.maths.combinatrics;

/**
 * Compute nCr % m
 *
 */
public class NCR {
    public int solve(int A, int B, int C) {
        int[][] res = new int[A+1][B+1];
        for (int i = 0; i < res.length; i++) {
            res[i][0] = 1;
        }
        for (int i = 1; i < res.length; i++) {
            for (int j = 1; j <=i&& j<res[0].length; j++) {
                long currResult = (res[i-1][j-1] %C + res[i-1][j] %C) %C;
                res[i][j] = (int) currResult;
            }
        }
       return res[A][B];
    }


}
