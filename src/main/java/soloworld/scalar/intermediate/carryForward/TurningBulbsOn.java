package soloworld.scalar.intermediate.carryForward;

/**
 * A wire connects N light bulbs.
 *
 * Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
 *
 * Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
 *
 * You can press the same switch multiple times.
 *
 * Note: 0 represents the bulb is off and 1 represents the bulb is on.
 *
 *
 *
 * Problem Constraints
 *
 * 0 <= N <= 5×105
 * 0 <= A[i] <= 1
 *
 *
 *
 * Input Format
 *
 * The first and the only argument contains an integer array A, of size N.
 *
 *
 *
 * Output Format
 *
 * Return an integer representing the minimum number of switches required.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  A = [0, 1, 0, 1]
 * Input 2:
 *
 *  A = [1, 1, 1, 1]
 */
public class TurningBulbsOn {
    public int bulbs(int[] A) {
        int count =0;
        boolean state = true;
        for(int i= 0;i< A.length;i++) {
           if(state == true && A[i]==0) {
               state= false;
               count++;
           }else if(state == false && A[i]==1) {
               state = true;
               count++;
           }
        }
        return count;
    }
}
