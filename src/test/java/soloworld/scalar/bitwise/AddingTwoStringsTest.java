package soloworld.scalar.bitwise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingTwoStringsTest {

    AddingTwoStrings addingTwoStrings;


    @BeforeEach
    void setUp() {
        addingTwoStrings = new AddingTwoStrings();
    }

    @Test
    void test1() {
        String s = addingTwoStrings.addBinary("100", "11");
        assertEquals("111",s);

    }
    @Test
    void test2() {
        String s = addingTwoStrings.addBinary("1", "1");
        assertEquals("10",s);

    }
}