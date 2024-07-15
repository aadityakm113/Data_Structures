import java.util.*;
public class AppendWithoutDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while(true){
            int val = sc.nextInt();
            if(val < 0){
                break;
            }
            if(!ll.check(val)){
                ll.insert(val);
            }
        }
        ll.display();
        sc.close();
    }
}

class LinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void insert(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = n;
    }

    public boolean check(int val){
        if(head == null)
            return false;
        Node temp = head;
        while(temp != null){
            if(temp.data == val)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public void display(){
        if(head == null)
            System.out.print("List is empty");
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
