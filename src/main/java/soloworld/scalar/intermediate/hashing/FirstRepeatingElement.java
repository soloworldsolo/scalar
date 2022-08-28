package soloworld.scalar.intermediate.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given an integer array A of size N, find the first repeating element in it.
 * <p>
 * We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.
 * <p>
 * If there is no repeating element, return -1.
 */
public class FirstRepeatingElement {

    public int solve(int[] A) {
        Map<Integer ,Integer> keys = new HashMap<>();
        for(int inp:A) {
            keys.putIfAbsent(inp ,0);
            keys.computeIfPresent(inp, (key,val) -> val+1);
        }
        for(int inp:A) {
            if(keys.get(inp) > 1) {
                return  inp;
            }
        }

        return -1;
    }

}
