package soloworld.scalar.bitwise;

/**
 * Alex has a cat named Boomer. He decides to put his cat to the test for eternity.
 *
 * He starts on day 1 with one stash of food unit, every next day, the stash doubles.
 *
 * If Boomer is well behaved during a particular day, only then she receives food worth equal to the stash produced on that day.
 *
 * Boomer receives a net worth of A units of food. What is the number of days she received the stash?
 */
public class NumOfSetBits {
    public int solve(int A) {
        int count=0;
        int i=1;
        while(i<=A) {
            if((i&A)==i) {
                count++;
            }
            i <<=1;
        }
        return count;
    }
}
