package soloworld.scalar.intermediate.matrix;

public class Multiplication {

    public int[][] solve(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        int noOfRows = A[0].length;
        int noOfColumns = B.length;
        if(noOfColumns == noOfRows) {
            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    int start =0;
                    int end =0;
                    sum =0;
                    while (start <noOfRows && end < noOfColumns) {
                        sum += A[i][start++] *B[end++][j];
                    }

                    result[i][j] = sum;
                }
            }
        }


        return result;
    }
}
