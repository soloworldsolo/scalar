package soloworld.scalar.advanced.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrailingZeroInfactorialTest {
    @Test
    public void TrailingZeros() {
        TrailingZeroInfactorial trailingZeroInfactorial = new TrailingZeroInfactorial();
        trailingZeroInfactorial.trailingZero(13);
    }
}