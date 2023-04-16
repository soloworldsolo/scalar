package soloworld.scalar.advanced.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FractionalNapsackTest {

    private FractionalNapsack fractionalNapsack;


    @BeforeEach
    void setUp() {
        fractionalNapsack = new FractionalNapsack();
    }


    @Test
    void test1() {
        List<Integer> input1 = List.of(60, 100, 120);
        List<Integer> input2 = List.of(10, 20, 30);
        int total = 50;
        int res = fractionalNapsack.solve(input1, input2, total);
        assertEquals(res, 24000);
    }

    @Test
    void test2() {
        List<Integer> input1 = List.of(10, 20, 30,40);
        List<Integer> input2 = List.of(12, 13, 15,19);
        int total = 10;
        int res = fractionalNapsack.solve(input1, input2, total);
        assertEquals(res, 2105);
    }
}