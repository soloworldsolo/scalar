package soloworld.scalar.string;

/**
 * You are given a function to_lower() which takes a character array A as an argument.
 * <p>
 * Convert each character of A into lowercase characters if it exists. If the lowercase of a character does not exist, it remains unmodified.
 * The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.
 * <p>
 * Return the lowercase version of the given character array.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * The only argument is a character array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the lowercase version of the given character array.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = ['S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
 * Input 2:
 * <p>
 * A = ['S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0']
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * ['s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y']
 * Output 2:
 * <p>
 * ['s', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * All the characters in the returned array are in lowercase alphabets.
 * <p>
 * <p>
 * <p>
 * See Expected Output
 */
public class ToLowerCase {
    public char[] to_lower(char[] A) {
        int i = 0;
        for (Character ch : A) {
            if (Character.isAlphabetic(ch) && Character.isUpperCase(ch)) {
                A[i] = Character.toLowerCase(ch);
            }
            i++;
        }
        return A;
    }
}
