package soloworld.scalar.intermediate.sorting;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent red, white, and blue, respectively.
 *
 * Note: Using the library sort function is not allowed.
 *
 *
 */
public class SortByColor {
    public int[] sortColors(int[] A) {
        Map<Integer, Long> collect = Arrays.stream(A).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        if(A.length ==1) {
          return  A;
      }
      int startCount =0;
      int entcount = collect.get(0).intValue() ;

      for(int i=startCount;i<entcount;i++) {
          A[i] = 0;
      }
      startCount = entcount;
      entcount = entcount+collect.get(1).intValue();
        for(int i=startCount;i<entcount;i++) {
            A[i] = 1;
        }

        startCount = entcount;
        entcount = entcount+collect.get(2).intValue();
        for(int i=startCount;i<entcount;i++) {
            A[i] = 2;
        }


        return A;
    }

}
