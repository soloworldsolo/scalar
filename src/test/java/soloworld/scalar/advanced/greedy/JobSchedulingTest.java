package soloworld.scalar.advanced.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JobSchedulingTest {

    private JobScheduling jobScheduling;


    @BeforeEach
    void setUp() {
        jobScheduling = new JobScheduling();
    }

    @Test
    void test1() {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>(List.of(1, 2, 50)));
        lists.add(new ArrayList<>(List.of(3, 5, 20)));
        lists.add(new ArrayList<>(List.of(6, 19, 100)));
        lists.add(new ArrayList<>(List.of(2, 100, 200)));



        jobScheduling.solve(lists);
    }
    @Test
    void test11() {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>(List.of(1, 3, 20)));
        lists.add(new ArrayList<>(List.of(2, 5, 20)));
        lists.add(new ArrayList<>(List.of(3, 10, 100)));
        lists.add(new ArrayList<>(List.of(4, 6, 70)));
        lists.add(new ArrayList<>(List.of(6, 9, 60)));

        int res = Integer.highestOneBit(100);
        System.out.println(res);

        jobScheduling.solve(lists);
    }
}