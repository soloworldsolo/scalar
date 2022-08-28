package soloworld.scalar.intermediate.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistancesTest {
  Distances distances;
    @BeforeEach
    void setUp() {
        distances = new Distances();
    }


    @Test
    void test1() {
        int [] input = {7, 1, 3, 4, 1, 7};
        int solve = distances.solve(input);
        assertEquals(solve ,3);
    }
}