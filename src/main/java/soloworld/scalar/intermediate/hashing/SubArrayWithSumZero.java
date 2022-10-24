package soloworld.scalar.intermediate.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SubArrayWithSumZero {

    public int isZero(int[] A) {
        long sum = 0;
        Set<Long> prefixMap = new HashSet<>();
        for (int inp : A) {
            sum += inp;
            if (sum == 0 || prefixMap.contains(sum) ) {
                return 1;
            }
            prefixMap.add(sum);
        }

        return 0;
    }
}
