package soloworld.scalar.advanced.maths.combinatrics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class NCRPrimeTest {

NCRPrime ncrPrime;
    @BeforeEach
    void setUp() {
        ncrPrime = new NCRPrime();

    }

    @Test
    void test1() {
        int res = ncrPrime.solve(5, 2, 13);
        assertEquals(10,res);
    }

    @Test
    void test11() {
        int res = ncrPrime.solve(1, 1, 1);

    }
        @Test
    void test111() {
        int res = ncrPrime.solve(778, 578, 10007);
        assertEquals(3624,res);
    }
}