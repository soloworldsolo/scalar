package soloworld.scalar.advanced.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GreyCodeTest {

    GreyCode greyCode;

    @BeforeEach
    void setUp() {
        greyCode = new GreyCode();
    }

    @Test
    void test1() {
        List<Integer> integers = greyCode.grayCode(2);
        assertEquals(integers,List.of(0,1,3,2));
        List<Integer> recursion = greyCode.recursion(2);
        assertEquals(recursion,List.of(0,1,3,2));

    }
}