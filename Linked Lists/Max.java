import java.util.*;
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while(true){
            int val = sc.nextInt();
            if(val<0)
                break;
            ll.insert(val);
        }
        System.out.println(ll.max());
  
        sc.close();
    }
}
class LinkedList{
    class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head = null;
    public void insert(int data){
        Node n = new Node(data);
        if(head==null){
            head = n;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=n;
    }
    public int max(){
        Node temp = head;
        int m = Integer.MIN_VALUE;
        while(temp!=null){
            if(temp.data>m){
                m=temp.data;
            }
            temp=temp.next;
        }
        return m;   
    }
}
