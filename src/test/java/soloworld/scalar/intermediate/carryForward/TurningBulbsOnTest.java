package soloworld.scalar.intermediate.carryForward;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurningBulbsOnTest {

    private TurningBulbsOn turningBulbsOn;

    @BeforeEach
    void setUp() {
        turningBulbsOn = new TurningBulbsOn();
    }

    @Test
    void test1() {
        var input =new int[] {1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1};
        int count = turningBulbsOn.bulbs(input);
        assertEquals(count,4);
    }
}