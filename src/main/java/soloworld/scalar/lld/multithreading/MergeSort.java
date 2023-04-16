package soloworld.scalar.lld.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {
    private List<Integer> inp;
    private ExecutorService executor;

    public MergeSort(List<Integer> inp, ExecutorService executor) {
        this.inp = inp;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {
        if (inp.size() == 1) {
            return inp;
        }
        int middle = inp.size() / 2;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0; i < middle; i++) {

            left.add(inp.get(i));
        }
        for (int i = middle; i < inp.size(); i++) {

            right.add(inp.get(i));

        }
        Future<List<Integer>> leftRes = executor.submit(new MergeSort(left, executor));
        Future<List<Integer>> rightRes = executor.submit(new MergeSort(right, executor));

        List<Integer> leftList = leftRes.get();
        List<Integer> rightList = rightRes.get();
        List<Integer> res = new ArrayList<>();
        int leftindex = 0;
        int rightIndex = 0;
        while (leftindex < leftList.size() || rightIndex < rightList.size()) {

            if (leftindex < leftList.size() && rightIndex < rightList.size()) {
                if (rightList.get(rightIndex) > leftList.get(leftindex)) {
                    res.add(leftList.get(leftindex++));
                } else {
                    res.add(rightList.get(rightIndex++));
                }
            } else if (leftindex < leftList.size()) {
                while (leftindex < leftList.size()) {
                    res.add(leftList.get(leftindex++));
                }
            } else if (rightIndex < rightList.size()) {
                while (rightIndex < rightList.size()) {
                    res.add(rightList.get(rightIndex++));
                }
            }
        }


        return res;
    }
}
