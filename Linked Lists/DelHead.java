import java.util.*;
public class DelHead{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    LinkedList ll= new LinkedList();
    while(true){
      int val = sc.nextInt();
      if(val<0)
        break;
      ll.insert(val);
    }
    ll.delAtHead();
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
    Node curr=head;
    while(curr.next!=null){
      curr=curr.next;
    }
    curr.next=n;
  }
  public void display(){
    if(head==null)
      return;
    Node temp=head;
    while(temp!=null){
      System.out.println(temp.data);
      temp=temp.next;
    }
  }
  public void delAtHead(){
    if(head==null)
      return;
    else{
      head=head.next;
    }
  }
}