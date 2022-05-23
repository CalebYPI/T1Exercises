package linkedlLists;
/**
 * 7. Swap Kth node from beginning with Kth node from end in a Linked List
 */
public class SwapKthValues {
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    class LinkedList {
        Node head;
        void push(int d) {
            Node n = new Node(d);
            n.next = head;
            head = n;
        }

        void showList() {
            Node node = head;
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.println("");
        }
    }
}
