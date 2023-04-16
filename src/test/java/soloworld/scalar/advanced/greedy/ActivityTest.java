package soloworld.scalar.advanced.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ActivityTest {

    Activity activity;

    @BeforeEach
    void setUp() {
        activity = new Activity();
    }


    @Test
    void test_positive() {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(17);
        list1.add(8);
        list1.add(14);
        list1.add(24);
        list1.add(10);
        list1.add(8);
        list1.add(1);
        list1.add(30);
      list2.add(18);
      list2.add(45);
      list2.add(24);
      list2.add(27);
      list2.add(18);
      list2.add(10);
      list2.add(38);
      list2.add(35);
        int res = activity.solve(list1, list2);
        assertEquals(4, res);
    } @Test
    void test_positive_1() {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(5);
        list1.add(1);
        list1.add(3);
        list1.add(0);
        list1.add(5);
        list1.add(8);
      list2.add(9);
      list2.add(2);
      list2.add(4);
      list2.add(6);
      list2.add(7);
      list2.add(9);

        int res = activity.solve(list1, list2);
        assertEquals(4, res);
    }
}