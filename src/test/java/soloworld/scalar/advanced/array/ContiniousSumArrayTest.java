package soloworld.scalar.advanced.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContiniousSumArrayTest {

    @Test
    void test1() {
        var input = new int[][] {{1,2,10},{2,3,20},{2,5,25}};
        ContiniousSumArray continiousSumArray = new ContiniousSumArray();
        int[] res = continiousSumArray.solve(5, input);

        assertArrayEquals(res, new int[]{10 ,55, 45, 25, 25});
    }
}