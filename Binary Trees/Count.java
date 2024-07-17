import java.util.*;
import java.util.LinkedList;
class Count 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    Queue<Node> q= new LinkedList<Node>();
    int val = sc.nextInt();
    Node root = new Node(val);
    int count=0;
    q.add(root);
    while(!q.isEmpty()){
      Node curr=q.poll();
      int l = sc.nextInt();
      if(l!=-1){
        Node n = new Node(l);
        curr.left=n;
        q.add(n);
        count++;
      }
      int r = sc.nextInt();
      if(r!=-1){
        Node n = new Node(r);
        curr.right=n;
        q.add(n);
        count++;
      }
    }
    count++;
    System.out.println(count);
    sc.close();
  }
}
class Node{
  int data;
  Node left;
  Node right;
  Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
  }
}