package soloworld.scalar.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseArrayTest {
   ReverseArray reverseArray;
    @BeforeEach
    public void setUp() {
        this.reverseArray = new ReverseArray();
    }

    @Test
   public void test1() {
        int[] input = {699, 732, 38, 773, 884, 113, 211, 208, 198, 548, 233, 128, 622, 913, 856, 739, 268, 346, 322, 641, 613, 204, 313, 823, 758, 866, 334, 394, 380, 229, 500, 78, 960, 538, 850, 196, 2, 60, 755, 200, 608, 339, 679, 581, 251, 887, 671, 871, 232, 344, 863, 844, 899, 175, 18 };
        int[] result = reverseArray.solve(input);
        assertArrayEquals(result,new int[]{18, 175, 899, 844, 863, 344, 232, 871, 671, 887, 251, 581, 679, 339, 608, 200, 755, 60, 2, 196, 850, 538, 960 ,78 ,500 ,229 ,380, 394 ,334 ,866 ,758, 823, 313, 204 ,613 ,641 ,322, 346,268, 739, 856, 913, 622, 128, 233, 548, 198, 208 ,211 ,113 ,884, 773, 38 ,732, 699});
    }
}