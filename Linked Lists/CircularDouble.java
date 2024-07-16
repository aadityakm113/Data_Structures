import java.util.*;
 
public class CircularDouble {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      LinkedList ll = new LinkedList();
      while(true){
        int val = sc.nextInt();
        int command = sc.nextInt();
        ll.insert(val);
        if(command==0){ll.display();break;}
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
      this.data = data;
      this.prev = null;
      this.next = null;
    }
  }
  Node head = null;
  Node tail = null;
  public void insert(int data){
    Node n = new Node(data);
    if(head==null){
      head = n;
      tail = n;
      tail.next = head;
      head.prev = tail;
      return;
    }
    tail.next=n;
    n.prev = tail;
    tail = tail.next;
    tail.next = head;
    head.prev = tail;
  }
  public void display(){
    if(head==null)return;
    Node temp = head;
    while(temp!=tail){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
  }
}