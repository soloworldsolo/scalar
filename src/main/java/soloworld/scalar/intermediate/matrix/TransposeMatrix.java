package soloworld.scalar.intermediate.matrix;

/**
 * Problem Description
 *
 * You are given a matrix A, you have to return another matrix which is the transpose of A.
 *
 * NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row. The tranpose of a matrix switches the element at (i, j)th index to (j, i)th index, and the element at (j, i)th index to (i, j)th index.
 *
 *
 * Problem Constraints
 *
 * 1 <= A.size() <= 1000
 *
 * 1 <= A[i].size() <= 1000
 *
 * 1 <= A[i][j] <= 1000
 */
public class TransposeMatrix {

    public int[][] solve(int[][] A) {
        int[][] result = new int[A[0].length][A.length];

        for(int i=0;i<A.length;i++) {
            for(int j=0;j<A[0].length;j++) {
                result[j][i] = A[i][j];
            }
        }

        return result;
    }
}
