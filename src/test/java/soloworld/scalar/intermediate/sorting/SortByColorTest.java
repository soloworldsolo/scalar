package soloworld.scalar.intermediate.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortByColorTest {
private  SortByColor sortByColor;

    @BeforeEach
    void setUp() {
        sortByColor = new SortByColor();
    }

    @Test
    void name() {
        var input = new int[] {0 ,1, 2, 0, 1, 2};

        int[] ints = sortByColor.sortColors(input);

        int[] res = sortByColor.sortColors(ints);
        assertArrayEquals(res , new int[]{0,0,1,1,2,2});
    }
}