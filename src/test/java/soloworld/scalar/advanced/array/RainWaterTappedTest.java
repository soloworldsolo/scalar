package soloworld.scalar.advanced.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RainWaterTappedTest {

    @Test
    public void test() {
            RainWaterTapped rainWaterTapped = new RainWaterTapped();
        int res = rainWaterTapped.trap(new int[]{0, 1, 0, 2});
        assertEquals(res,1);
    }
 @Test
    public void noWatercanbetapped() {
            RainWaterTapped rainWaterTapped = new RainWaterTapped();
        int res = rainWaterTapped.trap(new int[]{1,  2});
        assertEquals(res,0);

    }
    @Test
    public void failedcase() {
            RainWaterTapped rainWaterTapped = new RainWaterTapped();
        int res = rainWaterTapped.trap(new int[]{ 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 });
        assertEquals(res,6);
    }

}