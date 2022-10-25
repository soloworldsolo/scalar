package soloworld.scalar.intermediate.sorting;

import java.util.Arrays;

import static java.util.Arrays.*;
import static java.util.Arrays.sort;

/**
 * Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
 */
public class NobleInteger {
    public int solve(int[] A) {
        int n=A.length;
        sort(A);
        if(A[n-1]==0)
            return 1;
        for(int i=0; i<n-1; i++)
        {
            if(A[i]!=A[i+1] && A[i] == n-i-1)
                return 1;
        }
        return -1;
    }
}
