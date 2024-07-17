import java.util.*;
import java.util.LinkedList;

public class Traversal {
    public static void preorder(Node root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null)
            return;
        
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null)
            return;
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Node> q = new LinkedList<Node>();
        int val = sc.nextInt();
        Node root = new Node(val);
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            int l = sc.nextInt();
            if(l!=-1){
                Node n = new Node(l);
                curr.left=n;
                //curr.left=new Node(l) single line
                q.add(n);
                //q.add(curr.left);
                }
            int r = sc.nextInt();
            if(r!=-1){
                Node n = new Node(r);
                curr.right=n;
                //curr.right=new Node(r) single line
                q.add(n);
                // q.add(curr.right);
            }
        }
        System.out.println("Pre-Order Traversal");
        preorder(root);
        System.out.println("\nIn-Order Traversal");
        inorder(root);
        System.out.println("\nPost-Order Traversal");
        postorder(root);
        System.out.println(" ");
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
