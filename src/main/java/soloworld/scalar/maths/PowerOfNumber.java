package soloworld.scalar.maths;

public class PowerOfNumber {

    public int power(int x , int n,int d) {
        long a = x;
        long res = 1L;
        while (n > 0) {
            if (n % 2 == 1) {
                res *= a;
                res %= d;
            }
            a *= a;
            a %= d;
            n = n >> 1;
        }
        res = (res + d) % d;
        return (int) res;
    }
}
