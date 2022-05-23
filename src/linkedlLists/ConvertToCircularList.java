package linkedlLists;
/**
 * 4. Given a singly linked linear list, write a function to convert it to a circular list.
 */
public class ConvertToCircularList {
    
    static class Node {
        Node next;
        int data;
    }

    static Node circular(Node head) {
        Node h = head;
        while (head.next != null)
            head = head.next;
        head.next = h;
        return h;
    }

    static Node push(Node head, int d) {
        Node newNode = new Node();
        newNode.data = d;
        newNode.next = head;
        head = newNode;
        return head;
    }

    static void showList(Node head) {
        int count = 0;
        while (head.next != null) {
            if (count == 60)
                break;
            System.out.println(" " + head.data);
            head = head.next;
            count++;
        }
        System.out.println(" " + head.data + "\n list has circulated " + count + " times");
    }

    public static void main(String[] args) {
        Node head = null;

        head = push(head, 10);
        head = push(head, 20);
        head = push(head, 30);
        head = push(head, 40);
        head = push(head, 50);

        circular(head);

        showList(head);
    }
}
