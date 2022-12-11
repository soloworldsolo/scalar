package soloworld.scalar.advanced.array;

/**
 * Problem Description
 * Given a row-wise and column-wise sorted matrix A of size N * M.
 * Return the maximum non-empty submatrix sum of this matrix.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N, M <= 1000
 * -109 <= A[i][j] <= 109
 * <p>
 * <p>
 * Input Format
 * The first argument is a 2D integer array A.
 * <p>
 * <p>
 * Output Format
 * Return a single integer that is the maximum non-empty submatrix sum of this matrix.
 * <p>
 * <p>
 * Example Input
 * Input 1:-
 * -5 -4 -3
 * A = -1  2  3
 * 2  2  4
 * Input 2:-
 * 1 2 3
 * A = 4 5 6
 * 7 8 9
 * <p>
 * <p>
 * Example Output
 * Output 1:-
 * 12
 * Output 2:-
 * 45
 * <p>
 * <p>
 * Example Explanation
 * Expanation 1:-
 * The submatrix with max sum is
 * -1 2 3
 * 2 2 4
 * Sum is 12.
 * Explanation 2:-
 * The largest submatrix with max sum is
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * The sum is 45.
 */
public class MaximumMaximSubQueryMatrix {
    public long solve(int[][] A) {
        long prefixSum[][] = new long[A.length][A[0].length];
        calculatePrefixMatrix(prefixSum, A);
        long ans = Long.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                int x1 = i;
                int y1 = j;
                int x2 = A.length-1;
                int y2 = A[0].length-1;
                long sum = 0L;

                sum += prefixSum[x2][y2];

                if (x1 > 0) {
                    sum -= prefixSum[x1 - 1][y2];
                }

                if (y1 > 0) {
                    sum -= prefixSum[x2][y1 - 1];
                }

                if (x1 > 0 && y1 > 0) {
                    sum += prefixSum[x1 - 1][y1 - 1];
                }
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }

    private void calculatePrefixMatrix(long[][] prefixSum, int[][] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {

                prefixSum[i][j] = input[i][j];

                if (i > 0) {
                    prefixSum[i][j] += prefixSum[i - 1][j];
                }

                if (j > 0) {
                    prefixSum[i][j] += prefixSum[i][j - 1];
                }

                if (i > 0 && j > 0) {
                    prefixSum[i][j] -= prefixSum[i-1][j - 1];
                }
            }
        }
    }
}
