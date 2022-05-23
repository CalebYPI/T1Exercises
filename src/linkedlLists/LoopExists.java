package linkedlLists;
/**
 * 3. Write a program in Java to find out if there exists a loop in a single linked list
 */
public class LoopExists {
    
    static class Node {
        Node next;
        int data;
        int flagged;
    }

    static Node push(Node head, int d) {
        Node newNode = new Node();
        newNode.data = d;
        newNode.flagged = 0;
        newNode.next = head;
        head = newNode;
        return head;
    }

    static boolean checkLoop(Node head) {
        while (head != null) {
            if (head.flagged == 1)
                return true;
            head.flagged = 1;
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = null;

        head = push(head, 10);
        head = push(head, 20);
        head = push(head, 30);
        head = push(head, 40);
        head = push(head, 50);
        
        head.next.next.next.next.next = head;

        if (checkLoop(head))
            System.out.println("Loop detected");
        else
            System.out.println("Loop not detected");
    }
}
