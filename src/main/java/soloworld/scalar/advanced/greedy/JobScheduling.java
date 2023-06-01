package soloworld.scalar.advanced.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import static java.util.Comparator.comparingInt;

public class JobScheduling {

    public int solve(ArrayList<ArrayList<Integer>> A) {
        A.sort(comparingInt(list -> list.get(0)));
        int result = 0;
        PriorityQueue<List<Integer>> queue = new PriorityQueue<>(comparingInt(list -> list.get(0)));

        for (int i = 0; i < A.size(); i++) {
            int start = A.get(i).get(0);
            int end = A.get(i).get(1);
            int cost = A.get(i).get(2);
            while (!queue.isEmpty() && start >= queue.peek().get(0) ) {

                result = Math.max(result ,queue.peek().get(1));
                queue.remove();
            }

            queue.add(List.of(end, cost+result));
        }

        while (!queue.isEmpty()) {
            result = Math.max(result, queue.peek().get(1));
            queue.remove();
        }
        return result;
    }
}
