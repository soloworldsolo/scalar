package soloworld.scalar.intermediate.subarary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfSubArrayTest {

    @Test
   public void setUp() {
        SumOfSubArray z = new SumOfSubArray();
        long sum = z.subarraySum(new int[]{1, 2, 3});
        assertEquals(sum,20);

    }
}