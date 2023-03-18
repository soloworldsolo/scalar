package soloworld.scalar.advanced.maths;

public class PrimeModuloInverse {

    public int solve(int A, int B) {
        if(A < 0) {
            A =1/A;
            B =-B;
        }
        return (int)power(A,B-2,B);

    }
 /*
   solution based on ferments little theorem
  */
    private long power(int a, int power, int b) {
        if(power==0) {
            return 1;
        }

        long halfresult = power(a,power/2,b);

        if(power%2==0) {
            return  ((halfresult%b) *(halfresult%b))%b;
        }else {
            return  ((halfresult%b) *(halfresult%b)* (a%b))%b;
        }

    }
}
