package soloworld.scalar.intermediate.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.
 * <p>
 * NOTE:
 * <p>
 * Each element in the result should appear as many times as it appears in both arrays.
 * The result can be in any order.
 */
public class CommonElementinBothArray {

    public int[] solve(int[] A, int[] B) {
        Map<Integer, Integer> firstMap = new HashMap<>();
        Map<Integer, Integer> secondMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int first : A) {
            firstMap.putIfAbsent(first, 0);
            int value = firstMap.get(first) + 1;
            firstMap.put(first, value);
        }
        for (int first : B) {
            secondMap.putIfAbsent(first, 0);
            int value = secondMap.get(first) + 1;
            secondMap.put(first, value);
        }
        int[] inputArr = null;
        if(A.length >B.length) {
            inputArr = A;
        }else{
            inputArr = B;
        }

        for (int key : inputArr) {
            if (firstMap.containsKey(key) &&secondMap.containsKey(key)) {
                result.add(key);
                secondMap.computeIfPresent(key, (ke, val) -> (--val));
                firstMap.computeIfPresent(key, (k, v) -> --v);

                if (firstMap.get(key) == 0) {
                    firstMap.remove(key);
                }
                if (secondMap.get(key) == 0) {
                    secondMap.remove(key);
                }
            }
        }
        int[] res = new int[result.size()];
        int index = 0;
        for (int inp : result) {
            res[index++] = inp;
        }
        return res;
    }

}
