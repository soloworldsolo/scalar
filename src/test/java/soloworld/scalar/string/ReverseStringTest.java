package soloworld.scalar.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {
private ReverseString reverseString;

    @BeforeEach
    void setUp() {
        reverseString = new ReverseString();
    }

    @Test
    void test1() {
        var input = "the sky is blue";
        String rres = reverseString.solve(input);
        assertEquals( "blue is sky the",rres);

    }
}