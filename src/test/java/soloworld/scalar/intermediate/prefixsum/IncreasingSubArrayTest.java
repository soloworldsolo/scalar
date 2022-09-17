package soloworld.scalar.intermediate.prefixsum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingSubArrayTest {

    private IncreasingSubArray increasingSubArray;

    @BeforeEach
    void setUp() {
        increasingSubArray = new IncreasingSubArray();
    }

    @Test
    void test1() {
        var input = new int[]{1, 7, 3, 4, 9};
        var range = new int[][] {{0,1},{1,4}};

        int[] solve = increasingSubArray.solve(input, range);

        assertArrayEquals(solve , new int[] {1,0});
    }
    @Test
    void test11() {
        var input = new int[]{1, 1,7,2, 3};
        var range = new int[][] {{0,2},{2,4}};

        int[] solve = increasingSubArray.solve(input, range);

        assertArrayEquals(solve , new int[] {1,0});
    }
    @Test
    void test111() {
        var input = new int[]{ 44, 53, 29, 143, 66, 196, 124, 166, 132, 48, 57, 60, 3, 168, 32, 166, 73, 54, 58, 101, 101, 157, 100, 87, 119, 20, 121, 141, 200, 108, 31, 195, 30, 86, 173, 84, 62, 22, 70, 44, 58, 50, 8, 89, 113, 71, 77, 180, 197, 191, 113, 182, 41, 105, 100, 150, 180, 2, 177, 95, 117, 44, 130, 77, 182, 110, 104, 49, 164, 120, 114, 79, 46, 151, 63, 199, 178, 66, 129, 60, 57, 94, 24, 187, 124, 52, 73, 37, 7, 102, 126, 60, 198, 145, 121, 19, 130, 79, 20, 73, 21, 80, 190, 101, 80, 50, 167, 125, 118, 103, 157, 192, 127, 138, 130, 122, 70, 179, 21, 142, 147, 29, 11, 120, 89, 59, 11, 114, 90, 106, 178, 24, 142, 154, 138, 137, 29, 186, 131, 119, 47, 160, 96, 163, 49, 136, 45, 133, 73, 146, 140, 116, 92, 85, 118 }
        ;
        var range = new int[][] {{80,84}};

        int[] solve = increasingSubArray.solve(input, range);

        assertArrayEquals(solve , new int[] {1});
    }
}