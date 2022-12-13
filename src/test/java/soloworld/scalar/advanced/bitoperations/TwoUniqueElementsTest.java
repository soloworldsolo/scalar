package soloworld.scalar.advanced.bitoperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 *
 */
public class TwoUniqueElementsTest {

    @Test
    void test1() {
        var twoUniqueElements = new TwoUniqueElements();
        var input = new int[]{1, 2, 3, 1, 2, 4};

        int[] res = twoUniqueElements.solve(input);
        assertArrayEquals(new int[]{3, 4}, res);

    }
}