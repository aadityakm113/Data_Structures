import java.util.*;
class BstToLinkedList
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
    bst.convert(bst.root);
    bst.display();
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
}