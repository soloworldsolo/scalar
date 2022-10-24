package soloworld.scalar.intermediate.matrix;

/**
 *
 */
public class MaxtrixRotation {
    public int[][] rotate(int[][] matrix) {
     var result = new int[matrix.length][matrix[0].length];
     int startRow = 0;
     int startCol =0;
     int maxRow = matrix.length-1;
     int maxColumn = matrix[0].length-1;

     while (startRow <=maxRow) {
         int i = startRow;
         int j = 0;
         int k = maxRow;
         int l= maxColumn;
         int m = startCol;
         while (maxColumn>=j && k>=0) {
             result[i][j++] = matrix[k--][m];

         }
         startRow++;
         ;
         startCol++;


     }


     return result;
    }
}
