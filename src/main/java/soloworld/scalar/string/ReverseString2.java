package soloworld.scalar.string;

public class ReverseString2 {

    public String solve(String A) {
        if(A.length() ==1) {
            return A;
        }
        char [] charArry = A.toCharArray();
        char [] res = new char[charArry.length];
        int j=0;
        for(int i=charArry.length-1;i>=0;i--) {
            res[j++] = charArry[i];
        }

        return new String(res);

    }
}
