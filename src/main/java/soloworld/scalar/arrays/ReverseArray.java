package soloworld.scalar.arrays;

import java.util.Scanner;

public class ReverseArray {

    public int[] solve(final int[] A) {
        int noOfRotation = A.length-1 ;
        int[] newArary = new int[A.length];
        int index =0;
        while (index <A.length) {
            newArary[noOfRotation--] = A[index++];
        }
        return newArary;
    }




}
