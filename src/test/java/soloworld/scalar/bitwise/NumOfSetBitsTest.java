package soloworld.scalar.bitwise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumOfSetBitsTest {

    private NumOfSetBits numOfSetBits;

    @BeforeEach
   public void setUp() {
        numOfSetBits = new NumOfSetBits();
    }

    @Test
    public void test1() {
        int res = numOfSetBits.solve(567);
        assertEquals(res,6);
    }
}