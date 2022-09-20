package soloworld.scalar.bitwise;

/**
 *
 */
public class AddingTwoStrings {
    public String addBinary(String A, String B) {
        int carry = 0;
        StringBuilder builder = new StringBuilder();
        int firstIndex = A.length() - 1;
        int secondIndex = B.length() - 1;
        while (firstIndex >= 0 || secondIndex >= 0) {

            if (firstIndex >= 0) {
                if (A.toCharArray()[firstIndex--] - '0' == 1) {
                    carry++;
                }
            }
            if (secondIndex >= 0) {
                if (B.toCharArray()[secondIndex--] - '0' == 1) {
                    carry++;
                }
            }
            int num = carry % 2 == 0 ? 0 : 1;
            builder.append(num);
            carry /= 2;
        }

        if (carry == 1) {
            builder.append(carry);
        }

        return builder.reverse().toString();

    }

}
