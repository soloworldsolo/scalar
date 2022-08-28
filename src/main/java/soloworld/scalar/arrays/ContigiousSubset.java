package soloworld.scalar.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ContigiousSubset {

    public List<List<Integer>> getContigiousSubset(int[] input) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > input[i + 1]) {
                int value = input[i];
                List<Integer> res = new ArrayList<>();
                res.add(input[i]);
                while (i < input.length - 1 && value > input[i + 1]) {
                    res.add(input[++i]);
                }
                res.sort(Comparator.naturalOrder());
                result.add(res);

            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(input[i]);
                result.add(temp);
            }
        }
        return mergeAndSort(result);
    }

    public List<List<Integer>> mergeAndSort(List<List<Integer>> input) {
        List<Integer> listToRemove = new ArrayList<>();
        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i).size() > 0) {
                var list1 = input.get(i);
                var list2 = input.get(i + 1);
                int value1 = list1.get(list1.size() - 1);
                int value2 = list2.get(0);
                if (value1 > value2) {
                    listToRemove.add(i);
                    list2.addAll(list1);
                    list1.sort(Comparator.naturalOrder());
                }
            }

        }
        if (!listToRemove.isEmpty()) {
            int i = 0;

            Iterator<List<Integer>> iterator = input.listIterator();
            while (iterator.hasNext() && i< input.size()) {
                iterator.next();
                if (listToRemove.contains(i)) {
                    iterator.remove();
                }
                i++;
            }
        }
        return input;
    }

}

