package soloworld.scalar.advanced.bitoperations;

/**
 * Given an array of integers, every element appears thrice except for one, which occurs once.
 * <p>
 * Find that element that does not appear thrice.
 * <p>
 * NOTE: Your algorithm should have a linear runtime complexity.
 * <p>
 * Could you implement it without using extra memory?
 */
public class UniqueNumberTwo {
    public int singleNumber(final int[] A) {
        int answer = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (isBitSet(A[j], i)) {
                    count++;
                }
            }

            if (count % 3 == 1) {
                answer += (1 << i);
            }


        }
        return answer;

    }

    private boolean isBitSet(int A, int index) {
        return (A & (1 << index)) != 0;
    }
}
