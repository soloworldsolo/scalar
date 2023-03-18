package soloworld.scalar.advanced.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeModuloInverseTest {

    private PrimeModuloInverse primeModuloInverse;


    @Test
    void test1() {
        primeModuloInverse = new PrimeModuloInverse();
        int solve = primeModuloInverse.solve(6, 23);
        assertEquals(4, solve);
    }
}