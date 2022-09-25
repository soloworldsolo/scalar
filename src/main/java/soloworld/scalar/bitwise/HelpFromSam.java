package soloworld.scalar.bitwise;

/**
 *
 */
public class HelpFromSam {
    public int solve(int A) {
        int i=1;
        int count =0;
        while(i<=A) {
            if((i & A)==i) {
                count++;
            }
            i <<=1;
        }
        return count;

    }
}
