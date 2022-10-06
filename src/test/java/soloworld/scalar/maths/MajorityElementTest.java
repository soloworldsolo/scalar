package soloworld.scalar.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MajorityElementTest {


    private MajorityElement majorityElement;


    @BeforeEach
    void setUp() {
        majorityElement = new MajorityElement();
    }

    @Test
    void test1() {
        var input = new int[] { 1, 1, 1, 2, 3, 5, 7 };
      var res=  majorityElement.repeatedNumber(input);
        assertEquals(res, 1);
    }
}