package soloworld.scalar.intermediate.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class LargestSequenceZero {
    public int[] lszero(int[] A) {
        int[] prefixArr = new int[A.length];
        prefixArr[0] = A[0];
        for (int i = 1; i < prefixArr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + A[i];
        }
        Map<Integer, Integer> prefixMap = new HashMap<>();
        for (int inp : prefixArr) {
            prefixMap.putIfAbsent(inp, 0);
            prefixMap.computeIfPresent(inp, (k, v) -> ++v);
        }

        int startIndex = 0;
        int endIndex = 0;
        int total = 0;
        int index = 0;
        if (prefixMap.containsKey(0)) {
            for (int i = 0; i < A.length; i++) {
                if (prefixArr[i] == 0) {
                    endIndex = i;
                }
            }
            total = endIndex - startIndex;
        }

        for (int inp : prefixArr) {
            if (prefixMap.containsKey(inp) && prefixMap.get(inp) > 1) {
                int start = index + 1;
                int curr = start;
                while (start < prefixArr.length) {
                    if (prefixArr[start] == inp) {
                        curr = start;
                    }
                    start++;
                }
                if ((curr - (index + 1)) > total) {
                    total = (curr - index + 1);
                    startIndex = index + 1;
                    endIndex = curr;
                }
            }
            index++;
        }

        int[] res=null;
        if(endIndex >startIndex) {
            res = new int[(endIndex+1) - startIndex];
            for (int i = 0; i < res.length; i++) {
                res[i] = A[startIndex++];
            }
        }

        return res;
    }


}
