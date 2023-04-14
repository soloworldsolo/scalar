package soloworld.scalar.advanced.maths.prime;

public class Divisors {
    public int[] solve(int[] A) {
        int[] res = new int[A.length];
        int index = 0;
        for (int num : A) {
            int count = 0;
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    if (num / i == i) {
                        count++;
                    } else {
                        count += 2;
                    }
                }
            }
            res[index++] = count;
            count = 0;
        }
        return res;
    }
}
