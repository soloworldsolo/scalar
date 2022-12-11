package soloworld.scalar.advanced.array;

import soloworld.scalar.util.Interval;

import java.util.ArrayList;

/**
 * Problem Description
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 * <p>
 * You may assume that the intervals were initially sorted according to their start times.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 0 <= |intervals| <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is the vector of intervals
 * <p>
 * second argument is the new interval to be merged
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the vector of intervals after merging
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * Given intervals [1, 3], [6, 9] insert and merge [2, 5] .
 * Input 2:
 * <p>
 * Given intervals [1, 3], [6, 9] insert and merge [2, 6] .
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [ [1, 5], [6, 9] ]
 * Output 2:
 * <p>
 * [ [1, 9] ]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * (2,5) does not completely merge the given intervals
 * Explanation 2:
 * <p>
 * (2,6) completely merges the given intervals
 */
public class MergeIntervals {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> res = new ArrayList<>();
        int start = Math.min(newInterval.start, newInterval.end);
        int end = Math.max(newInterval.start, newInterval.end);;

        if(intervals.isEmpty()) {
            res.add(newInterval);
            return res;
        }

        if(newInterval.start > intervals.get(intervals.size()-1).end) {
            res.add(new Interval(start,end));
            res.addAll(intervals);
            res.sort((i1,i2) -> i1.start -i2.start);
            return res;
        }

        if(newInterval.end < intervals.get(0).start) {
            res.add(new Interval(start,end));
            res.addAll(intervals);
            res.sort((i1,i2) -> i1.start -i2.start);

            return res;
        }

        for (int i = 0; i < intervals.size(); i++) {
             int currStart =0;
             int currEnd =0;
            if(i==0) {
                if(start >intervals.get(i).start) {
                    start = intervals.get(0).start;
                    end = intervals.get(0).end;
                    currStart = Math.min(newInterval.start, newInterval.end);
                    currEnd = Math.max(newInterval.start,newInterval.end);
                }
                else {
                    currStart = intervals.get(i).start;
                    currEnd = intervals.get(i).end;
                }


            }else {
                currStart = intervals.get(i).start;
                currEnd = intervals.get(i).end;
            }

            if(currStart <= end){
                start = Math.min(start,currStart);
                end = Math.max(end,currEnd);
            }else {
                res.add(new Interval(start, end));
                start = currStart;
                end = currEnd;
            }

        }

          Interval last = intervals.get(intervals.size() - 1);

          if (start == last.start && end == last.end) {
              res.add(last);
          }



        if (res.isEmpty()) {
            res.add(new Interval(start, end));
        }
        res.sort((i1,i2) -> i1.start -i2.start);

        return res;
    }
}
