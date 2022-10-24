package soloworld.scalar.intermediate.matrix;

/**
 * Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= A <= 1000
 * <p>
 * <p>
 * <p>
 * Input Format
 * <p>
 * First and only argument is integer A
 * <p>
 * <p>
 * Output Format
 * <p>
 * Return a 2-D matrix which consists of the elements added in spiral order.
 * <p>
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * <p>
 * 1
 * Input 2:
 * <p>
 * 2
 * Input 3:
 * <p>
 * 5
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1:
 * <p>
 * [ [1] ]
 * Output 2:
 * <p>
 * [ [1, 2], [4, 3] ]
 * Output 2:
 * <p>
 * [ [1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9] ]
 * <p>
 * <p>
 * Example Explanation
 * <p>
 * Explanation 1:
 * <p>
 * Only 1 is to be arranged.
 * Explanation 2:
 * <p>
 * 1 --> 2
 * |
 * |
 * 4<--- 3
 * Explanation 3:
 */
public class SpiralFill {
    public int[][] generateMatrix(int A) {
        int[][] result = new int[A][A];
        int rowStart = 0;
        int colStart = 0;
        int maxRows = A - 1;
        int maxCols = A - 1;
        int value = 0;
        while (rowStart <= maxRows || colStart <=maxCols) {
            int j = colStart;
            while (j <= maxCols) {
                result[rowStart][j++] = ++value;
            }

                rowStart++;


            int k = rowStart;
            while ( k<=maxCols) {
                result[k++][maxCols] = ++value;
            }
            maxCols--;
            int l =maxCols;
            while (l >= colStart) {
                result[maxRows][l--] = ++value;
            }
            maxRows--;

            int m = maxRows;
            while (m >= rowStart) {
                result[m--][colStart] = ++value;
            }
            colStart++;
        }


        return result;
    }
}
