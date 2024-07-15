//given number of test cases t, n is the number of nodes and p is the number of nodes to be rotated by, rotate the doubly linked list
import java.util.*;

class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            LinkedList ll = new LinkedList();
            for (int j = 0; j < n; j++) {
                int val = sc.nextInt();
                ll.insert(val);
            }
            ll.rotate(p);
            ll.display();
        }
        sc.close();
    }
}

class LinkedList {
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insert(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = tail.next;
    }

    public void rotate(int p) {
        if (head == null || p <= 0)
            return;

        Node current = head;
        int count = 1;

        while (count < p && current != null) {
            current = current.next;
            count++;
        }

        if (current == null)
            return;

        Node newHead = current.next;
        if (newHead == null)
            return;

        newHead.prev = null;
        current.next = null;
        tail.next = head;
        head.prev = tail;
        head = newHead;
        tail = current;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
