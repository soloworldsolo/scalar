package soloworld.scalar.intermediate.prefixsum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialIndexTest {

SpecialIndex specialIndex;
    @BeforeEach
    void setUp() {
        specialIndex = new SpecialIndex();
    }


    @Test
    void test() {
        var input = new int[] {2,1,6,4};

        int res = specialIndex.specialIndex(input);
        assertEquals(res,1);
    }

    @Test
    void test1() {
        var input = new int[] {1,1,1};

        int res = specialIndex.specialIndex(input);
        assertEquals(res,3);
    }
}