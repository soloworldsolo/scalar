package soloworld.scalar.intermediate.matrix;

/**
 * You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= A.size() <= 103
 * <p>
 * 1 <= A[i].size() <= 103
 * <p>
 * 1 <= A[i][j] <= 103
 */
public class ColumnSum {
    public int[] solve(int[][] input) {
        int[] result = new int[input[0].length];
        int rows = input.length;
        int cols = input[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j] += input[i][j];
            }
        }
        return result;
    }
}
