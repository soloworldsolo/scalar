package soloworld.scalar.arrays;

import java.util.Scanner;

public class ReverseArray {

    public int[] solve(final int[] A) {
        int noOfRotation = A.length-1 ;
        int[] newArray = new int[A.length];
        int index =0;
        while (index <A.length) {
            newArray[noOfRotation--] = A[index++];
        }
        return newArray;
    }

}
