package soloworld.scalar.advanced.array;

import org.junit.jupiter.api.Test;
import soloworld.scalar.util.Interval;

import java.util.ArrayList;
import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class MergeIntervalsTest {

    @Test
    void test() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(6,9));
        ArrayList<Interval> res = mergeIntervals.insert(intervals, new Interval(2, 5));
        assertEquals(2,res.size());

    }
    @Test
    void test1() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(6,9));
        List<Interval> res = mergeIntervals.insert(intervals, new Interval(2, 6));
        assertEquals(1,res.size());

    }  @Test
    void test2() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,2));
        intervals.add(new Interval(8,10));
        List<Interval> res = mergeIntervals.insert(intervals, new Interval(3, 6));

    }
}