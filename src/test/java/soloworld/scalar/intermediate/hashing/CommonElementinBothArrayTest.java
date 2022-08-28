package soloworld.scalar.intermediate.hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonElementinBothArrayTest {

    private CommonElementinBothArray commonElementinBothArray;


    @BeforeEach
    void setUp() {

        commonElementinBothArray = new CommonElementinBothArray();
    }


    @Test
    void test1() {
        int[] input1= {1,2,2,1};
        int[] input2= {2,3,1,2};
        int[] solve = commonElementinBothArray.solve(input1, input2);

        Assertions.assertArrayEquals(solve, new int[]{1,2,2});
    }

    @Test
    void test2() {
        int[] input1= {2,1,4,10};
        int[] input2= {3,6,2,10,10};
        int[] solve = commonElementinBothArray.solve(input1, input2);

        Assertions.assertArrayEquals(solve, new int[]{2,10});
    }
}