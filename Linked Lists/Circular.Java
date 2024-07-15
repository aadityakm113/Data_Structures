import java.util.*;
public class Double {
    Scanner sc = new Scanner(System.in);

}

class LinkedList{
    class Node{
        Node prev;
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    Node head = null;
    Node tail = null;

    
    public void insert(int data){
        Node n = new Node(data);
        if(head==null){
            head=n;
            tail=n;
            return;
        }
        tail.next=n;
        n.prev=tail;
        tail=tail.next;
        tail.next=head;
        head.prev=tail;
    }

    public void display(){
        if(head==null)
            return;
        Node temp= head;
        while(temp!=tail){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
}
