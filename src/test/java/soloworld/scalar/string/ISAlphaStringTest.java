package soloworld.scalar.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ISAlphaStringTest {

    private ISAlphaString isAlphaString;

    @BeforeEach
   public void setUp() {
        isAlphaString = new ISAlphaString();
    }

    @Test
  public   void teat1() {
        var input = new char[]{'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        int solve = isAlphaString.solve(input);
          assertEquals(solve,1);
    }
    @Test
  public   void teat11() {
        var input = new char[]{'S', 'c', '_', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        int solve = isAlphaString.solve(input);
          assertEquals(solve,0);
    }
}