package soloworld.scalar.advanced.sorting;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class KthElement {
    public int kthsmallest(final List<Integer> A, int B) {
        int limit = B;
        int index =0;
       List<Integer> tmp = new ArrayList<>();
       tmp.addAll(A);
        int currentNumber = Integer.MAX_VALUE;
        while (limit >=0) {
            int currentIndex =0;
            for(int i= index ;i<tmp.size();i++) {
                if(tmp.get(i) < currentNumber) {
                    currentIndex = i;
                    currentNumber = tmp.get(i);
                }
            }
            swap(tmp, currentIndex,index);
            limit--;
            index++;
                currentNumber = Integer.MAX_VALUE;


        }
        return tmp.get(B-1);
    }

}
