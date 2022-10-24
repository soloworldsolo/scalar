package soloworld.scalar.intermediate.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestSequenceZeroTest {
    private LargestSequenceZero largestSequenceZero;

    @BeforeEach
    void setUp() {
        largestSequenceZero = new LargestSequenceZero();
    }

    @Test
    void test1() {
        int[] input =  {1,2,-2,4,-4};
        int[] lszero = largestSequenceZero.lszero(input);
        assertArrayEquals(lszero ,new int[]{2,-2,4,-4});
    }

    @Test
    void test2() {
        int[] input =  {-1, 1, 1, -1, -1, 1, 1, -1};
        int[] lszero = largestSequenceZero.lszero(input);
        assertArrayEquals(lszero ,new int[]{-1, 1, 1, -1, -1, 1, 1, -1});
    }
    @Test
    void test3() {
        int[] input =  {-19, 8, 2, -8, 19, 5, -2, -23};
        int[] lszero = largestSequenceZero.lszero(input);
        assertArrayEquals(lszero, new int[0] );
    }
    @Test
    void test4() {
        int[] input =  {-25, -6, 22, -28, 21, 8, -17, -9, -11, -4, -25, 0, 13, -10, -15, 15, 26, 27, 24, 0, 2 };
        int[] lszero = largestSequenceZero.lszero(input);
        assertArrayEquals(lszero ,new int[]{-4, -25 ,0, 13, -10, -15 ,15 ,26
        } );
    }

    @Test
    void test51() {
        int[] input =  {-8, 8, -1, -16, -28, -27, 15, -14, 14, -27, -5, -6, -25, -11, 28, 29, -3, -25, 17, -25, 4, -20, 2, 1, -17, -10, -25};
        int[] lszero = largestSequenceZero.lszero(input);
        assertArrayEquals(lszero ,new int[]{-8 ,8
        } );
    }

    @Test
    void test5() {
        int[] input =  {1,2,-2,4,-4 };
        int[] lszero = largestSequenceZero.lszero(input);
        assertArrayEquals(lszero ,new int[]{2,-2,4,-4
        } );
    }
    @Test
    void test6() {
        int[] input =  { 0, 22, 7, 21, -11, -6, -7, -16, -2 };
        int[] lszero = largestSequenceZero.lszero(input);
        assertArrayEquals(lszero ,new int[]{0
        } );
    }
}