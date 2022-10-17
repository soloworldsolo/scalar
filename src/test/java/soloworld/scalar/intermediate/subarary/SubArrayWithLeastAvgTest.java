package soloworld.scalar.intermediate.subarary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubArrayWithLeastAvgTest {


    @Test
    void test1() {
        var input =new int[] {3, 7, 90, 20, 10, 50, 40};
        var input_range = 3;

        int res = new SubArrayWithLeastAvg().solve(input, input_range);
        assertEquals(3,res);
    }

    @Test
    void test2() {
        var input =new int[] {335, 206, 63, 275, 213, 232, 171, 56, 461, 435, 380, 219, 186, 466, 455, 228, 310, 231, 54, 418, 333, 355, 53, 61, 363, 250, 315, 405, 369, 385, 113, 229, 342, 490, 358, 454, 441, 374, 24, 412, 73, 497, 175, 488, 303, 152, 47, 399, 185, 493, 461, 165, 293, 384, 100, 252, 458, 357, 157, 267, 470, 322, 320, 352, 59, 402 };
        var input_range = 57;

        int res = new SubArrayWithLeastAvg().solve(input, input_range);
        assertEquals(2,res);
    }

    @Test
    void test3() {
        var input =new int[] { 431, 313, 53, 251, 105, 423, 326, 297, 218, 89, 394, 365, 348, 474, 157, 262, 33, 187, 67, 79, 495, 199, 175, 228, 27, 305, 496, 331, 40, 98, 405, 221, 327, 488, 252, 73, 218, 152, 313, 274, 195, 353, 225, 292, 426, 257, 418, 364, 344, 349, 181 };
        var input_range = 12;

        int res = new SubArrayWithLeastAvg().solve(input, input_range);
        assertEquals(14,res);
    }


}