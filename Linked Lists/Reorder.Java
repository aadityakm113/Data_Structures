//Given a Singly Linked List a0 -> a1 -> a2 -> .. -> a(n-1) -> an. The task is to reorder it to a0 -> an -> a1 -> a(n-1) -> a2 -> a(n-2) -> ..
import java.util.Scanner;
class Reorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList ll = new LinkedList();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ll.insertAtBeginning(val);
        }

        ll.reorder();
        ll.display();

        sc.close();
    }
}

class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insertAtBeginning(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void reorder() {
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find the middle of the list
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        Node secondHalf = slow.next;
        slow.next = null;
        secondHalf = reverse(secondHalf);

        // Step 3: Merge the two halves
        Node firstHalf = head;
        head = mergeAlternately(firstHalf, secondHalf);
    }

    private Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private Node mergeAlternately(Node first, Node second) {
        Node dummy = new Node(0);
        Node current = dummy;

        while (first != null && second != null) {
            Node firstNext = first.next;
            Node secondNext = second.next;

            current.next = first;
            first.next = second;
            current = second;

            first = firstNext;
            second = secondNext;
        }

        if (first != null) {
            current.next = first;
        }

        return dummy.next;
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
