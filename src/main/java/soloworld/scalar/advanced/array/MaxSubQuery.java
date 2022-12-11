package soloworld.scalar.advanced.array;

/**
 * Given a matrix of integers A of size N x M and multiple queries Q, for each query, find and return the submatrix sum.
 * <p>
 * Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.
 * <p>
 * NOTE:
 * <p>
 * Rows are numbered from top to bottom, and columns are numbered from left to right.
 * Sum may be large, so return the answer mod 109 + 7.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N, M <= 1000
 * -100000 <= A[i] <= 100000
 * 1 <= Q <= 100000
 * 1 <= B[i] <= D[i] <= N
 * 1 <= C[i] <= E[i] <= M
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument given is the integer matrix A.
 * The second argument given is the integer array B.
 * The third argument given is the integer array C.
 * The fourth argument given is the integer array D.
 * The fifth argument given is the integer array E.
 * (B[i], C[i]) represents the top left corner of the i'th query.
 * (D[i], E[i]) represents the bottom right corner of the i'th query.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer array containing the submatrix sum for each query.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [   [1, 2, 3]
 * [4, 5, 6]
 * [7, 8, 9]   ]
 * B = [1, 2]
 * C = [1, 2]
 * D = [2, 3]
 * E = [2, 3]
 * Input 2:
 * <p>
 * A = [   [5, 17, 100, 11]
 * [0, 0,  2,   8]    ]
 * B = [1, 1]
 * C = [1, 4]
 * D = [2, 2]
 * E = [2, 4]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [12, 28]
 * Output 2:
 * <p>
 * [22, 19]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * For query 1: Submatrix contains elements: 1, 2, 4 and 5. So, their sum is 12.
 * For query 2: Submatrix contains elements: 5, 6, 8 and 9. So, their sum is 28.
 * Explanation 2:
 * <p>
 * For query 1: Submatrix contains elements: 5, 17, 0 and 0. So, their sum is 22.
 * For query 2: Submatrix contains elements: 11 and 8. So, their sum is 19.
 */
public class MaxSubQuery {
    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        long[][] prefixSum = new long[A.length][A[0].length];
        int[] result = new int[B.length];
        calculatePrefixSum(prefixSum, A);
        for (int i = 0; i < result.length; i++) {
            int[] leftCorner = new int[]{B[i] - 1, C[i] - 1};
            int[] rightCorner = new int[]{D[i] - 1, E[i] - 1};
            long res = 0;
            res = prefixSum[rightCorner[0]][rightCorner[1]];
            if (leftCorner[0] > 0) {
                res -= prefixSum[leftCorner[0] - 1][rightCorner[1]];
            }

            if (leftCorner[1] > 0) {
                res -= prefixSum[rightCorner[0]][leftCorner[1] - 1];
            }

            if (leftCorner[0] > 0 && leftCorner[1] > 0) {
                res += prefixSum[leftCorner[0] - 1][leftCorner[1] - 1];
            }

            res = res % 1000000007;
            if (res < 0) {
                res = (res + 1000000007) % 1000000007;
            }

            result[i] = (int) res;

        }

        return result;
    }

    private void calculatePrefixSum(long[][] prefixSum, int[][] input) {
        prefixSum[0][0] = input[0][0];

        for (int i = 1; i < input[0].length; i++) {
            prefixSum[0][i] = prefixSum[0][i - 1] + input[0][i];
        }

        for (int i = 1; i < input.length; i++) {
            prefixSum[i][0] = prefixSum[i - 1][0] + input[i][0];
        }

        for (int i = 1; i < input.length; i++) {

            for (int j = 1; j < input[0].length; j++) {
                prefixSum[i][j] = (input[i][j] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1] + 1000000007) % 1000000007;


            }

        }
    }
}
