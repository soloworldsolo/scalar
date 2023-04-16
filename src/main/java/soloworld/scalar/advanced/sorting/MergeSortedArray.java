package soloworld.scalar.advanced.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {

    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        ArrayList <Integer> res = new ArrayList<>();

          int firstIndex =0;
          int secondIndex =0;

          while (firstIndex < A.size() && secondIndex < B.size()) {
              if(A.get(firstIndex) <= B.get(secondIndex)) {
                  res.add(A.get(firstIndex++));
              }else {
                  res.add(secondIndex++);
              }
          }

          if (firstIndex <A.size()) {
              while (firstIndex <A.size()) {
                  res.add(A.get(firstIndex++));
              }
          }
          if (secondIndex <B.size()) {
              while (secondIndex <B.size()) {
                  res.add(B.get(secondIndex++));
              }
          }


        return  res;

    }
}
