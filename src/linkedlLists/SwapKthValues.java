package linkedlLists;
/**
 * 7. Swap Kth node from beginning with Kth node from end in a Linked List
 */
public class SwapKthValues {
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    static class LinkedList {
        static Node head;
        void push(int d) {
            Node n = new Node(d);
            n.next = head;
            head = n;
        }

        static void showList() {
            Node node = head;
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.println("");
        }

        public int nodeCount() {
            int count = 0;
            Node node = head;
            while (node != null) {
                node = node.next;
                count++;
            }
            return count;
        }

        public void swap(int kth) {
            int count = nodeCount();
            if (count < kth)
                return;
            if (2 * kth - 1 == count)
                return;

            Node node1 = head;
            Node prev1 = null;
            for (int i = 1; i < kth; i++) {
                prev1 = node1;
                node1 = node1.next;
            }

            Node node2 = head;
            Node prev2 = null;
            for (int i = 1; i < count; i++) {
                prev2 = node2;
                node2 = node2.next;
            }
            
            if (prev1 != null)
                prev1.next = node2;
            
            if (prev2 != null)
                prev2.next = node1;
            
            Node temp = prev1.next;
            prev1.next = prev2.next;
            prev2.next = temp;

            if (kth == 1)
                head = node2;

            if (kth == count)
                head = node1;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 8; i >= 1; i--)
            list.push(i);
        
        System.out.println("Original");
        LinkedList.showList();

        System.out.println("\n");
        for (int i = 1; i < 9; i++) {
            list.swap(i);
            System.out.println("Swapped list: " + i);
            LinkedList.showList();
            System.out.println("");
        }
    }
}
