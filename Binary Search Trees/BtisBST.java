import java.util.*;
import java.util.LinkedList;
class BtIsBST {
  public static void inorder(Node curr){
    if(curr==null)return;
     inorder(curr.left);
     //System.out.print(curr.data+" ");
     inorder(curr.right);
  }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n==0){
        System.out.print("True");
        return;
      }
      Queue<Node> q = new LinkedList<Node>();
      Node root = new Node(sc.nextInt());
      q.add(root);
      int i=1;
      for(i=1;i<n;){
        Node curr = q.poll();
        int left = sc.nextInt();
        curr.left = new Node(left);
        q.add(curr.left);
        i++;
        if(i>=n)break;
        {
          int right = sc.nextInt();
          curr.right = new Node(right);
          q.add(curr.right);
          i++;
        }
      }
      inorder(root);
      //System.out.println("Hello, World!");
      int m = Integer.MIN_VALUE;
      int M = Integer.MAX_VALUE;
      if(Evaluate(root,m,M)){
        System.out.print("True");
      }
      else{
        System.out.print("False");
      }
      sc.close();   
  }
  public static boolean Evaluate(Node curr, int m, int M){
    if(curr==null)return true;
    else if(curr.data<=m || curr.data>=M){
      return false;
    }
    else
      return (Evaluate(curr.left,m,curr.data) && Evaluate(curr.right,curr.data,M));
  }
}

class Node{
  int data;
  Node left;
  Node right;
  Node(int val){
    data = val;
    left = null;
    right = null;
  }
}