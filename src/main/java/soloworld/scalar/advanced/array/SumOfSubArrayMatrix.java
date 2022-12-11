package soloworld.scalar.advanced.array;

/**
 * Problem Description
 * Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <=30
 * <p>
 * 0 <= A[i][j] <= 10
 * <p>
 * <p>
 * <p>
 * Input Format
 * Single argument representing a 2-D array A of size N x N.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the sum of all possible submatrices in the given matrix.
 * <p>
 * <p>
 * <p>
 * Example Input
 * A = [ [1, 1]
 * [1, 1] ]
 * <p>
 * <p>
 * Example Output
 * 16
 * <p>
 * <p>
 * Example Explanation
 * Number of submatrices with 1 elements = 4, so sum of all such submatrices = 4 * 1 = 4
 * Number of submatrices with 2 elements = 4, so sum of all such submatrices = 4 * 2 = 8
 * Number of submatrices with 3 elements = 0
 * Number of submatrices with 4 elements = 1, so sum of such submatrix = 4
 * Total Sum = 4+8+4 = 16
 */
public class SumOfSubArrayMatrix {
    public int solve(int[][] A) {
        int noOfRows = A.length;
        int noOfCols = A[0].length;
        int result = 0;
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfCols; j++) {
                result += ((i + 1) * (j + 1)) * ((noOfCols-j) * (noOfRows-i)) * A[i][j];
            }
        }

        return result;

    }
}
