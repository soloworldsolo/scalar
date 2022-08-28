package soloworld.scalar.intermediate.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubArrayWithSumZero {

    public boolean isZero(int[] A) {
        int[] prefixArr = new int[A.length];
        prefixArr[0] = A[0];
        for (int i = 1; i < prefixArr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + A[i];

        }
      Set<Integer> prefixMap = new HashSet<>();
         int sum =0;
        for (int inp : prefixArr) {
           sum+=inp;

           if(sum ==0 || prefixMap.contains(inp)) {
               return  true;
           }
           prefixMap.add(inp);
        }




     return  false;
    }
}
