import java.util.*;
class PrintRange
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    Tree bst = new Tree();
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
      int val = sc.nextInt();
      if(val<0)
        break;
      bst.root=bst.insert(bst.root,val);
    }
    int l=sc.nextInt();
    int u=sc.nextInt();
    bst.inorder(bst.root,l,u);
    sc.close();
  }
}
class Tree{
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
  Node root= null;
  public Node insert(Node curr,int val){
      if(curr==null){
        Node n = new Node(val);
        return n;
      }
      else if (val<curr.data){
        curr.left=insert(curr.left,val);
      }
      else if(val>curr.data){
        curr.right=insert(curr.right,val);
      }
      return curr;
    }
    public void inorder(Node curr,int l, int u){
      if(curr==null)
        return;
      inorder(curr.left,l,u);
      if(curr.data>=l&&curr.data<=u){
        System.out.print(curr.data+" ");
      }
      inorder(curr.right,l,u);
    }
}