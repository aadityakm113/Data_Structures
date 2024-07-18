import java.util.*;
class BstToLinkedList
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    Tree bst = new Tree();
   //int n = sc.nextInt();
    while(true){
      int val = sc.nextInt();
      if(val<0)
        break;
      bst.root=bst.insert(bst.root,val);
    }
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    Tree.Node res = bst.lca(bst.root,n1,n2);
    System.out.print(res.data+" ");
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
  Node root=null;
  public Node insert(Node curr, int val){
    if(curr==null){
      return new Node(val);
    }
    else if(curr.data>val){
      curr.left=insert(curr.left,val);
    }
    else if(curr.data<val){
      curr.right=insert(curr.right,val);
    }
    return curr;
  }
  Node head=null;
  Node tail=null;
  public void convert(Node curr){
    if(curr==null)
      return;
    else
      convert(curr.left);
    if(head==null)
      head=curr;
    else{
      curr.left=tail;
      tail.right=curr;
    }
    tail=curr;
    convert(curr.right);
  }
  public void display(){
    if(head==null)
      return;
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp=temp.right;
    }
  }

  public Node lca(Node curr,int n1,int n2){
    if(curr==null|| curr.data==n1|| curr.data==n2)
        return curr;
    Node left=lca(curr.left,n1,n2);
    Node right=lca(curr.right,n1,n2);
    if(left==null)
        return right;
    else if(right==null)
        return null;
  }
}