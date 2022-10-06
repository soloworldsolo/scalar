package soloworld.scalar.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayRotationTest {

    public ArrayRotation arrayRotation;


    @BeforeEach
    void setUp() {
        arrayRotation = new ArrayRotation();
    }

    @Test
    public void test() {
        int[] input = {1,2,3,4};
        int[] res = arrayRotation.rotate(input, 2);
        assertArrayEquals(res,new int[]{3,4,1,2});

    }
    @Test
   public void test1() {
        int[] input = {1,1,1,1,1};
        int[] res = arrayRotation.rotate(input, 6);
        assertArrayEquals(res,new int[]{1,1,1,1,1});


    }
}