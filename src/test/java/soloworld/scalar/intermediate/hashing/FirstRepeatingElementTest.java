package soloworld.scalar.intermediate.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstRepeatingElementTest {
    FirstRepeatingElement firstRepeatingElement;
    @BeforeEach
    void setUp() {
        firstRepeatingElement = new FirstRepeatingElement();
    }

    @Test
    void test1() {
        int[] input = {10, 5, 3, 4, 3, 5, 6};
        int res = firstRepeatingElement.solve(input);
        assertEquals(res,5);
    }
}