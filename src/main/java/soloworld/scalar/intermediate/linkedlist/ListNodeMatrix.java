package soloworld.scalar.intermediate.linkedlist;

import soloworld.scalar.util.ListNode;

/**
 * Given a matrix A of size Nx3 representing operations. Your task is to design the linked list based on these operations.
 * <p>
 * There are four types of operations:
 * <p>
 * 0 x -1: Add a node of value x before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
 * 1 x -1: Append a node of value x to the last element of the linked list.
 * 2 x index: Add a node of value x before the indexth node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
 * 3 index -1: Delete the indexth node in the linked list, if the index is valid.
 * A[i][0] represents the type of operation.
 * <p>
 * A[i][1], A[i][2] represents the corresponding elements with respect to type of operation.
 * <p>
 * Note: Indexing is 0 based.
 * <p>
 * A = [   [0, 1, -1]
 * [1, 2, -1]
 * [2, 3, 1]   ]
 */
public class ListNodeMatrix {
    ListNode head = null;
    public ListNode solve(int[][] A) {


        for (int[] conditions : A
        ) {
            if (conditions[0] == 0) {
                insertInHead(conditions[1]);
            } else if (conditions[0] == 1) {

                insertInTail(conditions[1]);
            } else if (conditions[0] == 2) {

                insertAt(conditions[1], conditions[2]);
            } else if (conditions[0] == 3) {

                deleteAt(conditions[1]);
            }
        }
        return head;
    }

    private void deleteAt(int position) {
        if (position == 0) {

            ListNode temp =head== null ? null: head.next;
            head.next = null;
            head = temp;
        } else {

            int currentPosition = 0;
            ListNode currentNode = head;
            while (currentPosition < position-1 && currentNode != null) {
                currentNode = currentNode.next;
                currentPosition++;
            }

            if (currentNode != null) {
                ListNode temp = null;
                ListNode node = currentNode.next;
                if (node != null) {
                    temp = node.next;
                }
                currentNode.next = temp;

            }
        }
    }

    private void insertAt(int value, int position) {

        ListNode currentNode = head;
        int currentposition = 0;
        if (position == 0) {
            currentNode = new ListNode(value);
            currentNode.next = head;
                head = currentNode;
            return;
        }

        while (currentposition < position-1 && currentNode != null) {
            currentNode = currentNode.next;
            currentposition++;
        }
        if (currentNode != null) {
            ListNode temp = currentNode.next;
            ListNode node = new ListNode(value);

            currentNode.next = node;
            node.next = temp;

        }

    }

    private void insertInTail(int value) {
        if (head == null) {
            head = new ListNode(value);

            return;
        }
        ListNode node = new ListNode(value);
       ListNode currentNode = head;
       while(currentNode !=null && currentNode.next !=null) {
           currentNode = currentNode.next;
       }
       currentNode.next= node;
    }

    private void insertInHead(int value) {
        ListNode temp = head;
        if (head == null) {
            head = new ListNode(value);
        }else {
            head = new ListNode(value);
            head.next = temp;
        }




    }
}
