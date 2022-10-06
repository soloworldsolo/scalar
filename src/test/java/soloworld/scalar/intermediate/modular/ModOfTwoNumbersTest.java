package soloworld.scalar.intermediate.modular;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModOfTwoNumbersTest {

  ModOfTwoNumbers modOfTwoNumbers;

    @BeforeEach
   public void setUp() {
      modOfTwoNumbers = new ModOfTwoNumbers();
    }

    @Test
  public   void name() {
        var input = "43535321";
      int res= modOfTwoNumbers.findMod(input,47);
       assertEquals(20 ,res);
}

@Test
public   void name1() {
      int res= modOfTwoNumbers.findMod("143",2);
       assertEquals(1 ,res);
}

@Test
public   void name2() {
        var input ="6562800446546751053033681283622332585949169375825307419010747907087102529693988502714663897293527240363734284937813181135000995192664742291904645171438423695200374401117403";
      int res= modOfTwoNumbers.findMod(input,36173);
       assertEquals(33132 ,res);
}
}