package soloworld.scalar.intermediate.modular;

/**
 * You are given a large number in the form of a string A where each character denotes a digit of the number.
 * You are also given a number B. You have to find out the value of A % B and return it.
 *
 *
 *
 * Problem Constraints
 * 1 <= A.length() <= 105
 * 0 <= Ai <= 9
 * 1 <= B <= 109
 */
public class ModOfTwoNumbers {
    public int findMod(String A, int B) {
        char[] chars = A.toCharArray();
        int power =1;
        long val =0;
        for(int i= chars.length-1;i>=0;i--) {

            val =((val%B) + ((Character.getNumericValue(chars[i]) * (power %B))%B))%B;
            power = (power*10)%B;

        }
        return  (int) val;
    }
}
