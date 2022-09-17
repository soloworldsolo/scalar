package soloworld.scalar.intermediate.carryForward;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubStringTest {

    private MaximumSubString maximumSubString;


    @BeforeEach
    void setUp() {
        maximumSubString = new MaximumSubString();
    }

    @Test
    void occurancesPresent() {

        var input = "ABCGAG";

        int res = maximumSubString.solve(input);

        assertEquals(res ,3);

    }
    @Test
    void occurancesNotPresent() {

        var input = "GAB";

        int res = maximumSubString.solve(input);

        assertEquals(res ,0);

    }
}