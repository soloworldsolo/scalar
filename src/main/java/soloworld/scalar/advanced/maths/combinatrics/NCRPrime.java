package soloworld.scalar.advanced.maths.combinatrics;

/**
 * Compute nCr % p
 * Given three integers A, B, and C, where A represents n, B represents r, and C represents p and p is a prime number greater than equal to n, find and return the value of nCr % p where nCr % p = (n! / ((n-r)! * r!)) % p.
 * <p>
 * x! means factorial of x i.e. x! = 1 * 2 * 3... * x.
 * <p>
 * NOTE: For this problem, we are considering 1 as a prime.
 */
public class NCRPrime {
    public int solve(int A, int B, int C) {
        long res;
        long ncrfactorial = factorial(A - B, C);
        long nrfactorial = factorial(B, C);
        long ncrfactorialpower =  power(ncrfactorial, C - 2,C) ;
        long nrfactorialpower =  power(nrfactorial, C - 2,C);
        res = (((factorial(A, C) % C) * (ncrfactorialpower % C) % C) * nrfactorialpower % C) % C;
        return (int) res;

    }

    public long factorial(int num, int modulo) {
        long fact = 1;
        int i=1;
        while (i<=num) {
            fact =(((fact%modulo)) * (i%modulo))%modulo ;
            i++;
        }
        return fact;
    }

    public long power(long num1, long num2, int modulo) {
        if (num1 == 0 || num2 ==1) {
            return (num1 +modulo)%modulo;
        }

        if(num2==0 || num1 ==1) {
            return 1;
        }
        long half = power(num1, num2 / 2, modulo);
        if (num2 % 2 == 0) {
            return ((half) % modulo * (half) % modulo) % modulo;
        } else {
            return (((half % modulo) * (half % modulo)) % modulo * (num1 % modulo)) % modulo;
        }
    }
}
