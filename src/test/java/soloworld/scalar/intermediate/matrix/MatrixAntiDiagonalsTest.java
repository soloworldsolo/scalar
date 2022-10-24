package soloworld.scalar.intermediate.matrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixAntiDiagonalsTest {

    private MatrixAntiDiagonals matrixAntiDiagonals;


    @BeforeEach
    void setUp() {
        matrixAntiDiagonals = new MatrixAntiDiagonals();
    }

    @Test
    void test() {
        var input =new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int[][] diagonal = matrixAntiDiagonals.diagonal(input);
        System.out.println(diagonal);
    }


}