package soloworld.scalar.bitwise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelpFromSamTest {

    private HelpFromSam helpFromSam;

    @BeforeEach
   public void setUp() {
        helpFromSam = new HelpFromSam();
    }

    @Test
    public void test1() {
        int solve = helpFromSam.solve(8549);

        assertEquals(6,solve);
    }
}