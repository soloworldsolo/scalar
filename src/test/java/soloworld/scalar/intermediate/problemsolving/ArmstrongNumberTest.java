package soloworld.scalar.intermediate.problemsolving;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArmstrongNumberTest {

    private  ArmstrongNumber armstrongNumber;

    @BeforeEach
    void setUp() {
        armstrongNumber = new ArmstrongNumber();
    }

    @Test
    void test1() {
        int calculate = armstrongNumber.calculate(153);
        assertEquals(153,calculate);
    }
}