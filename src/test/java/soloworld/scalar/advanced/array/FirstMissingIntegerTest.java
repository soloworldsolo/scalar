package soloworld.scalar.advanced.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstMissingIntegerTest {

    @Test
    public void test() {
        var firstMissingInteger = new FirstMissingInteger();
        var input =new int[] {3,4,-1,1};
        int res = firstMissingInteger.firstMissingPositive(input);

        assertEquals(2,res);


    }

    @Test
    public void test1TimeExceeded() {
        var firstMissingInteger = new FirstMissingInteger();
        var input =new int[] {2,3,1,2};
        int res = firstMissingInteger.firstMissingPositive(input);

        assertEquals(4,res);


    }


}