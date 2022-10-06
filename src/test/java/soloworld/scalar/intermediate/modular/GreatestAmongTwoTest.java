package soloworld.scalar.intermediate.modular;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreatestAmongTwoTest {

    private GreatestAmongTwo greatestAmongTwo;

    @BeforeEach
  public   void setUp() {
        greatestAmongTwo = new GreatestAmongTwo();
    }

    @Test
  public   void test1() {
        int res = greatestAmongTwo.solve(5, 10);
        assertEquals(5,res);
    }

    @Test
  public   void test2() {
        int res = greatestAmongTwo.solve(1358026, 8807399);
        assertEquals(7449373,res);
        System.out.println(8807399-1358026 );
        System.out.println(8807399%7449373 );
    }
}