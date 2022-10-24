package soloworld.scalar.intermediate.matrix;

public class MatrixAntiDiagonals {
    public int[][] diagonal(int[][] A) {
        int[][] result = new int[2*A.length-1][A.length];
        int noOfRows = A.length;
        //Lower matrix
        for(int i=0;i<noOfRows;i++){
            int row=0;
            int col=i;
            int k=0;
            while(col>=0 && row<A.length){
                result[i][k++]=A[row][col];
                row++;
                col--;
            }
        }
        //upper matrix
        for(int i=1;i<noOfRows;i++){
            int row=i;
            int col=noOfRows-1;
            int k=0;
            while(col>=0 && row<A.length){
                result[i+noOfRows-1][k++]=A[row][col];
                row++;
                col--;
            }
        }

        return  result;
    }
}
