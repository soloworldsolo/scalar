package soloworld.scalar.advanced.bitoperations;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AllPossibleSubSetTest {
   @Test
    public void test1() {
        var allPossibleSubSet = new AllPossibleSubSet();
        List<Integer> input = new ArrayList();
        input.add(1);input.add(2);
        input.add(3);
       var subsets = allPossibleSubSet.subsets(input);
   }
}