import java.util.*;
class LinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null; //not mandatory in java but it is good practice. Mandatory in C++
        }
    }
    Node head = null; //data type of head is Node

    public void insert(int data){
        Node n = new Node(data);
        if(head==null){
            head=n;
            return;
        }
        Node curr = head;
        while (curr.next!=null) {
            curr=curr.next;
        }
        curr.next=n;
    }

    public void display(){
        if(head==null)
            return;
        Node temp= head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void insertAtHead(int data){
        Node n = new Node(data);
        n.next=head;
        head=n;
    } 
}
public class InsertAtHead {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();   
        while (true) {
            int val = sc.nextInt();
            if(val<0)
                break;
            ll.insert(val);
        }
        ll.display();
        sc.close();
    }
}
