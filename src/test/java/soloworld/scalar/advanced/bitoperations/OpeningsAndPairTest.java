package soloworld.scalar.advanced.bitoperations;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class OpeningsAndPairTest {

    @Test
    public void test() {
        var openingsAndPair = new OpeningsAndPair();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(53);
        input.add(39);
        input.add(88);
       assertEquals(37, openingsAndPair.solve(input));
    }

    @Test
    public void test1() {
        var openingsAndPair = new OpeningsAndPair();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(38);
        input.add(44);
        input.add(84);
        input.add(12);
       assertEquals(36, openingsAndPair.solve(input));
    }

}