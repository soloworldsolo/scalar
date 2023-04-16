package soloworld.scalar.advanced.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KthElementTest {

    private KthElement kthElement;

    @BeforeEach
    void setUp() {
        kthElement = new KthElement();
    }

    @Test
    void test1() {
        ArrayList<Integer> inp = new ArrayList<>();
        inp.add(2);
        inp.add(1);
        inp.add(4);
        inp.add(3);
        inp.add(2);
        int res = kthElement.kthsmallest(inp, 3);
        assertEquals(res,2);
    }
    @Test
    void test12() {
        List<Integer> Arry = Arrays.
                asList(new Integer[]
                        {94, 87, 100, 11, 23, 98, 17, 35, 43, 66, 34, 53, 72, 80, 5, 34, 64, 71, 9, 16, 41, 66, 96 });

        int res = kthElement.kthsmallest(Arry, 19);
        assertEquals(res,87);
    }
}