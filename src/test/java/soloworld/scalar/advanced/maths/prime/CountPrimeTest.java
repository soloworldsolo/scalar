package soloworld.scalar.advanced.maths.prime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountPrimeTest {

    private CountPrime countPrime;

    @BeforeEach
    void setUp() {
        countPrime = new CountPrime();
    }

    @Test
    void test1() {
        int[] res = countPrime.solve(7);
        assertArrayEquals(res, new int[] {2,3,5,7});
    }
    @Test
    void test2() {
        int[] res = countPrime.solve(12);
        assertArrayEquals(res, new int[] {2,3,5,7,11});
    }
}