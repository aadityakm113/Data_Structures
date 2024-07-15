import java.util.*;
public class DelTail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while(true){
            int val= sc.nextInt();
            if(val<0){
                break;
            }
            ll.insert(val);
        }
        ll.del();
        ll.display();
        sc.close();

    }
}

class LinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;

    public void insert(int data){
        Node n = new Node(data);
        if(head==null){
            head=n;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=n;
    }

    public void del(){
        Node curr= head;
        //we must delete the node before the tail node
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
    }

    public void display(){
        if(head==null)
            return;
        Node temp = head;
        while(temp!=head){
            System.out.println(temp.data);    
            temp=temp.next;
        }
    }
}
