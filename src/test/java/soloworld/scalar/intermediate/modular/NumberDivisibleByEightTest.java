package soloworld.scalar.intermediate.modular;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberDivisibleByEightTest {

    @Test
   public void test1() {
        var input = "40897237111816995922805307737859413552091006514927603847883130124746756767426237849396480087733429432861339411285568084588535007444731";
        int res = new NumberDivisibleByEight().solve(input);
        assertEquals(res ,0);
    }
    @Test
   public void test11() {
        var input = "8";
        int res = new NumberDivisibleByEight().solve(input);
        assertEquals(res ,1);
    }

    @Test
   public void test111() {
        var input = "16";
        int res = new NumberDivisibleByEight().solve(input);
        assertEquals(res ,1);
    }

    @Test
   public void test1111() {
        var input = "4";
        int res = new NumberDivisibleByEight().solve(input);
        assertEquals(res ,0);
    } @Test
   public void test11111() {
        var input = "17";
        int res = new NumberDivisibleByEight().solve(input);
        assertEquals(res ,0);
    }
}