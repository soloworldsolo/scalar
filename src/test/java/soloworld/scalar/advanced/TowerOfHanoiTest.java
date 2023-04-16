package soloworld.scalar.advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import soloworld.scalar.advanced.recursion.TowerOfHanoi;

import java.util.ArrayList;

class TowerOfHanoiTest {

    TowerOfHanoi towerOfHanoi;

    @BeforeEach
    void setUp() {
        towerOfHanoi = new TowerOfHanoi();
    }

    @Test
    void test1() {
        ArrayList<ArrayList<Integer>> solve = towerOfHanoi.solve(3);

    }
}