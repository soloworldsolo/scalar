package soloworld.scalar.intermediate.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import soloworld.scalar.util.ListNode;

import static org.junit.jupiter.api.Assertions.*;

public class ListNodeMatrixTest {

    private ListNodeMatrix listNodeMatrix;

    @BeforeEach
    void setUp() {
        listNodeMatrix = new ListNodeMatrix();
    }

    @Test
    void test1() {
        var input = new int[][] {   {0, 1, -1},
                {1, 2, -1},
                {2, 3, 1}   };

        ListNode res = listNodeMatrix.solve(input);

        assertEquals(res.val,1);
        assertEquals(res.next.val,3);
        assertEquals(res.next.next.val,2);

    }

    @Test
    void test2() {
        var input = new int[][] {   {0, 1, -1},
                {1, 2, -1},
                {2, 3, 1},
                {0, 4, -1},
                {3, 1, -1},
                {3, 2, -1}  };

        ListNode res = listNodeMatrix.solve(input);

        assertEquals(res.val,4);
        assertEquals(res.next.val,3);

    }
    @Test
    void test3() {
        var input = new int[][] {

                        {3, 1, -1},
                        {2, 12, 0},
                        {3, 0, -1},
                        {2, 11, 0},
                        {0, 15, -1},
                        {2, 19, 0},
                        {2, 4, 2},
                        {1, 1, -1},
                        {3, 4, -1},
                        {3, 1, -1},
                        {1, 4, -1},
                        {3, 2, -1},
                        {0, 12, -1},
                        {0, 7, -1},
                        {0, 17, -1},
                        {2, 9, 6},
                        {0, 6, -1},
                        {3, 0, -1},
                        {1, 10, -1},
                        {3, 5, -1},
                        {2, 19, 3},
                        {1, 19, -1},
                        {0, 12, -1},
                        {1, 2, -1},
                        {2, 7, 11},
                        {3, 9, -1},
                        {3, 8, -1},
                        {2, 8, 3},
                        {0, 7, -1},
                        {2, 13, 8},
                        {3, 9, -1},
                        {1, 5, -1},
                        {2, 7, 6},
                        {2, 11, 0},
                        {3, 9, -1},
                        {0, 3, -1},
                        {0, 1, -1},
                        {0, 1, -1},
                        {2, 3, 11},
                        {0, 4, -1},
                        {2, 6, 19}



        };

        ListNode res = listNodeMatrix.solve(input);
          ListNode current = res;
        while(current != null) {
            System.out.print( current.val + "->");
            current = current.next;
        }


    }

}