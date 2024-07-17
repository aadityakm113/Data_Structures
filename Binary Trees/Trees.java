import java.util.*;
import java.util.LinkedList;
public class Trees {
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
