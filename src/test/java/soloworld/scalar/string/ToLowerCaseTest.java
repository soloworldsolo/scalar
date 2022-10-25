package soloworld.scalar.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ToLowerCaseTest {

    private ToLowerCase toLowerCase;

    @BeforeEach
    void setUp() {
        toLowerCase = new ToLowerCase();
    }

    @Test
    void test1() {
        char[] chars = toLowerCase.to_lower(new char[]{'S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0'});

        assertArrayEquals(new char[]{'s', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'},chars);


    }
}