import java.util.*;
public class Circular
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    LinkedList ll = new LinkedList();
    while(true){
      int val = sc.nextInt();
      int x = sc.nextInt();
      if(x==0){
        ll.insert(val);
        ll.display();
        break;
      }
      if(x==1)
        ll.insert(val);
    }
  }
}

class LinkedList{
  class Node{
    int data;
    Node next=null;
    Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  Node head= null;
  Node tail=null;
  public void insert(int data){
    Node n = new Node(data);
    if(head==null){
      head=n;
      tail=n;
      tail.next=head;
      return;
    }
    tail.next=n;
    tail=n;
    tail.next=head;
  }
   public void display(){
    if(head==null){
      System.out.print("List is empty");return;
    }
    Node temp = head;
    while(temp!=tail){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.print(temp.data);
  }
}