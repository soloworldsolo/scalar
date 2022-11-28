package soloworld.scalar.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LittlePonyTest {

    private LittlePony littlePony;

    @BeforeEach
    void setUp() {
        littlePony = new LittlePony();
    }

    @Test
    void test1() {
        var input = new int[] {2, 4, 3, 1, 5};
        int solve = littlePony.solve(input, 3);
        assertEquals(solve,2);
    }
}