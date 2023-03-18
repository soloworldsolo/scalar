package soloworld.scalar.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PowerOfNumberTest {

    PowerOfNumber powerOfNumber ;

    @Test
    void test1() {
        powerOfNumber = new PowerOfNumber();
        int res = powerOfNumber.power(2, 5,33);
        assertEquals(32,res);
    }

    @Test
    void test2() {
        powerOfNumber = new PowerOfNumber();
        long res = powerOfNumber.power(6, 23,33);
        assertEquals(32,res);
    }

    @Test
    void test3() {
        powerOfNumber = new PowerOfNumber();
        long res = powerOfNumber.power(-1, 1,19);
        assertEquals(20,res);
    }
}