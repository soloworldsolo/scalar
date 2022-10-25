package soloworld.scalar.string;

/**
 * You are given a string A of size N.
 * <p>
 * Return the string A after reversing the string word by word.
 * <p>
 * NOTE:
 * <p>
 * A sequence of non-space characters constitutes a word.
 * Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
 * If there are multiple spaces between words, reduce them to a single space in the reversed string.
 */
public class ReverseString {
    public String solve(String A) {
        if (A == null || A.isEmpty()) {
            return A;
        }
        String[] strArray = A.split(" ");
        String result = "";
        for (int i = strArray.length - 1; i >= 0; i--) {
            if (!strArray[i].isBlank()) {
                result += strArray[i];
                if (i != 0) {
                    result += " ";
                }
            }
        }
        return result;
    }


}
