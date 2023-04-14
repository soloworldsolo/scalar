package soloworld.scalar.advanced.maths.combinatrics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NCRTest {


    private NCR ncr;


    @BeforeEach
    void setUp() {
        ncr = new NCR();
    }

    @Test
    void test1() {
        int factorial = ncr.solve(5, 2,13);
        assertEquals(10,factorial);
    }

    @Test
    void test1_1() {
        int factorial = ncr.solve(6, 2,13);
        assertEquals(2,factorial);
    }
}