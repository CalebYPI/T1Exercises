package linkedlLists;
/**
 * 1. Write a program using a linked list to multiply the two following polynomial:
 * A: 7x^2 + 5x + 3
 * B: 3x + 7
 */
public class MultiplyPolynomial {

    static class Node {
        int coeff, power;
        Node next;
    }

    static Node addNode(Node poly3, int coeff, int power) {
        Node newNode = new Node();
        newNode.coeff = coeff;
        newNode.power = power;
        newNode.next = null;

        if (poly3 == null)
            return newNode;

        Node p = poly3;
        while (p.next != null)
            p = p.next;
        return poly3;
    }

    static void showList(Node p) {
        while (p.next != null) {
            System.out.println(p.coeff + "x^" + p.power + "+");
            p = p.next;
        }
        System.out.println(p.coeff + "\n");
    }

    static void removeDuplicate(Node start) {
        Node p1, p2;
        p1 = start;

        while (p1 != null && p1.next != null) {
            p2 = p1;
            while (p2.next != null) {
                if (p1.power == p2.next.power) {
                    p1.coeff = p1.coeff + p2.next.coeff;
                    p2.next = p2.next.next;
                }
                else 
                    p2 = p2.next;
                p1 = p1.next;
            }
        }
    }

    static Node multiply (Node poly1, Node poly2, Node poly3) {
        Node p1, p2;
        p1 = poly1;
        p2 = poly2;
        while (p1 != null) {
            while (p2 != null) {
            int coeff, power;
            coeff = p1.coeff * p2.coeff;
            power = p1.power + p2.power;
            poly3 = addNode(poly3, coeff, power);
            p2 = p2.next;
            }
            p2 = poly2;
            p1 = p1.next;
        }
        removeDuplicate(poly3);
        return poly3;
    }

    public static void main(String[] args) {
        Node poly1 = null;
        Node poly2 = null;
        Node poly3 = null;

        poly1 = addNode(poly1, 7, 2);
        poly1 = addNode(poly1, 5, 1);
        poly1 = addNode(poly1, 3, 0);

        poly2 = addNode(poly2, 3, 1);
        poly2 = addNode(poly2, 7, 0) ;     

        System.out.println("1st Polynomial: ");
        showList(poly1);

        System.out.println("2nd Polynomial: ");
        showList(poly2);

        poly3 = multiply(poly1, poly2, poly3);

        System.out.println("3rd Polynomial: ");
        showList(poly3);
    }
}
