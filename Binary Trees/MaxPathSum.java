import java.util.*;
import java.util.LinkedList;
class Main
{
  static int M = 0;
  public static int maxpathsum(Node root){
    if(root==null)
      return 0;
    int lsum = maxpathsum(root.left);
    int rsum = maxpathsum(root.right);
    M = Math.max(M,lsum+rsum+(root.data));
    
    return root.data+Math.max(lsum,rsum);
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    Queue<Node> q = new LinkedList<>();
    int val = sc.nextInt();
    Node root= new Node(val);
    q.add(root);
    while(!q.isEmpty()){
      Node curr = q.poll();
      int l = sc.nextInt();
      if(l!=-1){
        Node n = new Node(l);
        curr.left=n;
        q.add(n);
      }
      int r = sc.nextInt();
      if(r!=-1){
        Node n = new Node(r);
        curr.right=n;
        q.add(n);
      }
    }
    maxpathsum(root);
    System.out.print(M);
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