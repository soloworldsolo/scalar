package soloworld.scalar.advanced.bitoperations;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of distinct integers A, return all possible subsets.
 * <p>
 * NOTE:
 * <p>
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * Also, the subsets should be sorted in ascending ( lexicographic ) order.
 * The list is not necessarily sorted.
 * <p>
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= |A| <= 16
 * INTMIN <= A[i] <= INTMAX
 * <p>
 * <p>
 * Input Format
 * <p>
 * First and only argument of input contains a single integer array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * <p>
 * Return a vector of vectors denoting the answer.
 * <p>
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * <p>
 * A = [1]
 * Input 2:
 * <p>
 * A = [1, 2, 3]
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1:
 * <p>
 * [
 * []
 * [1]
 * ]
 * Output 2:
 * <p>
 * [
 * []
 * [1]
 * [1, 2]
 * [1, 2, 3]
 * [1, 3]
 * [2]
 * [2, 3]
 * [3]
 * ]
 */
public class AllPossibleSubSet {
    private static int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
        for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
            if (a.get(i) < b.get(i)) {
                return -1;
            }
            if (a.get(i) > b.get(i)) {
                return 1;
            }

        }
        if (a.size() > b.size()) {
            return 1;
        }

        return -1;
    }

    public ArrayList<ArrayList<Integer>> subsets(List<Integer> A) {
        int noOfPermutations = (int) Math.pow(2, A.size());
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < noOfPermutations; i++) {
            ArrayList<Integer> res = new ArrayList<>();
            for (int j = 0; j < A.size(); j++) {
                if (isBitSet(i, j)) {
                    res.add(A.get(j));
                }
            }
            result.add(res);
        }
        result.sort(AllPossibleSubSet::compare);
        return result;

    }

    private boolean isBitSet(int A, int index) {
        return (A & (1 << index)) != 0;
    }
}
