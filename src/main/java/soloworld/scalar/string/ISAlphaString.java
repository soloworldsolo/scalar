package soloworld.scalar.string;

public class ISAlphaString {
    public int solve(char[] A) {

        for(Character ch: A) {
            if(!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
                return 0;
            }
        }
        return 1;
    }
}
