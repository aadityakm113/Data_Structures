import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class BFT {
    public static void level(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Queue<Node> q = new LinkedList<>();
     int val=sc.nextInt();
     Node root = new Node(val);
     q.add(root);
     while (!q.isEmpty()) {
        Node curr=q.poll();
        int l = sc.nextInt();
        if(l!=-1){
            Node n = new Node(l);
            curr.left=n;
            q.add(n);
        }
        int r= sc.nextInt();
        if(r!=-1){
            Node n = new Node(r);
            curr.right=n;
            q.add(n);
        }
     }
     level(root);
     sc.close();
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node (int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
