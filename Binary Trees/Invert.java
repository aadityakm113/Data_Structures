import java.util.*;
import java.util.LinkedList;
class Invert
{
	public static void inorder(Node root){
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static Node invert(Node root){
		if(root==null)
			return null;
		Node left=invert(root.left);
		Node right=invert(root.right);
		root.left=right;
		root.right=left;
		return root;
	}
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  Queue<Node> q= new LinkedList<>();
	  String s = sc.nextLine();
      String[] arr = s.split(" ");
      int val = Integer.parseInt(arr[0]);
      Node root = new Node(val);
      q.add(root);
      for(int i=1;i<arr.length;i++){
        Node curr = q.poll();
        if(!arr[i].equals("N")){
          val = Integer.parseInt(arr[i]);
          curr.left = new Node(val);
          q.add(curr.left);
        }i++;
        if(i>=arr.length)break;
        if(!arr[i].equals("N")){
          val = Integer.parseInt(arr[i]);
          curr.right = new Node(val);
          q.add(curr.right);
		}
	  
  }
	  Node inverted=invert(root);
	  inorder(inverted);
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