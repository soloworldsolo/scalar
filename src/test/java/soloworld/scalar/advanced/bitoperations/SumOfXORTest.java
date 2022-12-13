package soloworld.scalar.advanced.bitoperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfXORTest {

    @Test
    void test1() {
        var inp = new int[]{1, 2, 3};
        SumOfXOR sumOfXOR = new SumOfXOR();
        int res = sumOfXOR.solve(inp);
        assertEquals(res, 6);
    }
}