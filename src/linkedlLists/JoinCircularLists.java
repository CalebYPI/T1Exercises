package linkedlLists;
/**
 * 5. Given two circular lists A and B, write an O (1) function to join them into one circular list A, leaving the other list B empty.
 */
public class JoinCircularLists {
    
    static class Node {
        Node next;
        int data;
    }

    static Node reverseList(Node head) {
        if (head.next == null)
            return head;
        Node rev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }

    static Node sortAndMerge(Node a, Node b) {
        a = reverseList(a);
        b = reverseList(b);
        Node head = null;
        Node temp;
        while (a != null && b != null) {
            if (a.data >= b.data) {
                temp = a.next;
                a.next = head;
                head = a;
                a = temp;
            }
            else {
                temp = b.next;
                b.next = head;
                head = b;
                b = temp;
            }
        }
        while (a != null) {
            temp = a.next;
                a.next = head;
                head = a;
                a = temp;
        }
        while (b != null) {
            temp = b.next;
                b.next = head;
                head = b;
                b = temp;
        }
        return head;
    }

    static void showList(Node node) {
        while (node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static Node setNode(int d) {
        Node temp = new Node();
        temp.data = d;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {
        Node result = null;

        Node list1 = setNode(10);
        list1.next = setNode(20);
        list1.next.next = setNode(30);
        list1.next.next.next = setNode(40);
        list1.next.next.next.next = setNode(50);

        Node list2 = setNode(15);
        list2.next = setNode(25);
        list2.next.next = setNode(35);
        list2.next.next.next = setNode(45);
        list2.next.next.next.next = setNode(55);

        System.out.println("List A: ");
        showList(list1);
        System.out.println("\n\nList B: ");
        showList(list2);

        System.out.println("\n\nMerged List: ");
        result = sortAndMerge(list1, list2);
        showList(result);
    }
}
