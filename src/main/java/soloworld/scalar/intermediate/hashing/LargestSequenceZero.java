package soloworld.scalar.intermediate.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class LargestSequenceZero {
    public int[] lszero(int[] A) {
            Map<Integer, Integer> indexMap = new HashMap<>();
            int sum = 0;
            int startIndex = -1;
            int endIndex = Integer.MAX_VALUE;
            for (int i = 0;   i < A.length; i++) {
                sum += A[i];
                if (sum == 0) {
                    int index = i;
                    if (index > (endIndex - startIndex)) {
                        startIndex = -1;
                        endIndex = i;
                    } }else if (indexMap.containsKey(sum)) {
                        int index = i - indexMap.get(sum);
                        if (index > (endIndex - startIndex)) {
                            startIndex = indexMap.get(sum);
                            endIndex = i;
                        }
                    } else {
                        indexMap.put(sum, i);

                    }
                }
                if (sum == 0) {
                    return A;
                }

                if (endIndex!=Integer.MAX_VALUE) {
                    int[] res = new int[endIndex - startIndex];
                    int resIndex = 0;
                    for (int i = startIndex + 1; i <= endIndex; i++) {
                        res[resIndex++] = A[i];
                    }
                    return res;
                }

                return new int[0];
            }
        }


