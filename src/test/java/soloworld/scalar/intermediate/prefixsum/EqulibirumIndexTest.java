package soloworld.scalar.intermediate.prefixsum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqulibirumIndexTest {

    private EqulibirumIndex equlibirumIndex;

    @BeforeEach
    void setUp() {
        equlibirumIndex = new EqulibirumIndex();
    }

    @Test
    void test1() {
        var inputArray = new int[] {-7, 1, 5, 2, -4, 3, 0};
        int result = equlibirumIndex.findEquilibriumIndex(inputArray);
        assertEquals(result,3);

    }

    @Test
    void test2() {
        var inputArray = new int[] {1,2,3};
        int result = equlibirumIndex.findEquilibriumIndex(inputArray);
        assertEquals(result,-1);

    }
}