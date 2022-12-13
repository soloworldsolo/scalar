package soloworld.scalar.advanced.bitoperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueNumberTwoTest {


    @Test
    public void test1() {
        var input = new int[]{1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        UniqueNumberTwo uniqueNumberTwo = new UniqueNumberTwo();
        int res = uniqueNumberTwo.singleNumber(input);
        assertEquals(4, res);
    }

    @Test
    public void test2() {
        var input = new int[]{0, 0, 0, 1};
        UniqueNumberTwo uniqueNumberTwo = new UniqueNumberTwo();
        int res = uniqueNumberTwo.singleNumber(input);
        assertEquals(1, res);
    }
}