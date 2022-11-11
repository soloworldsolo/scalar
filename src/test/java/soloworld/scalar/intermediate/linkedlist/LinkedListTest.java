package soloworld.scalar.intermediate.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {





    @Test
    void test1() {
        LinkedList.insert_node(1,24);
        LinkedList.insert_node(2,25);
        LinkedList.print_ll();
        LinkedList.delete_node(1);
        LinkedList.insert_node(2,26);
        LinkedList.insert_node(2,27);
    }
}