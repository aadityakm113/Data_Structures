import java.util.*;
public class Double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while(true){
            int val = sc.nextInt();
        if(val<0)
            break;
        ll.insert(val);
    }
    ll.display();
    sc.close();
    }
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
    }

    public void display(){
        if(head==null)
            return;
        Node temp= head;
        while(temp!=null){
            System.out.println(temp.data);
            //temp=temp.next;
            temp=temp.prev; //to print from tail(reverse order)
        }
    }
}
