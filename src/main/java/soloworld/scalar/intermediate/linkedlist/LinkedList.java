package soloworld.scalar.intermediate.linkedlist;

/**
 * Design and implement a Linked List data structure.
 * A node in a linked list should have the following attributes - an integer value
 * and a pointer to the next node. It should support the following operations:
 */
public class LinkedList {

    private static class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    private static ListNode head = null;


    private static int currentPosition=1;

    public static void insert_node(int position, int value) {
        if (position == 1) {
            ListNode temp = null;
            if (head != null) {
                temp = head;
            }

            head = new ListNode(value,temp);
            ++currentPosition;
        } else {
             if(position >0 && position <= currentPosition) {
                 ListNode node = getNodeByPosition(position-1);
                 ListNode temp = node.next;
                 node.next = new ListNode(value,temp);
                 ++currentPosition;
             }
        }
    }

    private static ListNode getNodeByPosition(int position) {
        ListNode node = head;
        int i=1;
        while (i<position && node != null) {
            node = node.next;
            i++;
        }

        return node;
    }

    public static void delete_node(int position) {
        if(position >0 && position <= currentPosition) {

          if(position ==1) {
              ListNode temp = head.next;
              head.next = null;
              head = temp;
              currentPosition--;
              return;
          }

           ListNode prev = getNodeByPosition(position-1);
           ListNode node = prev.next;
           ListNode temp = null;
           if(node!=null) {
               temp = node.next;
           }
           prev.next = temp;
           currentPosition--;
        }
    }

    public static void print_ll() {
        ListNode node = head;
        while (node !=null) {
            System.out.print(node.value +(node.next == null?"":" "));
            node = node.next;
        }
    }
}
