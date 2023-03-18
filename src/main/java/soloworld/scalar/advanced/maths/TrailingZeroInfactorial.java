package soloworld.scalar.advanced.maths;

public class TrailingZeroInfactorial {

    public int trailingZero(int num ) {
        int result = 0;
        int currentMultiple =5;
        while (num >= currentMultiple) {
            result += num/currentMultiple;
            currentMultiple *=5;
        }
        return result;
    }
}
