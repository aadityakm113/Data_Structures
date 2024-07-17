import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Diameter {
    public static int h(Node root){
        if(root==null)
            return 0;
        return Math.max(h(root.left), h(root.right))+1;
    }

    public static int d(Node root){
        if(root==null)
            return 0;
        int lch=h(root.left);
        int rch=h(root.right);
        int curr=lch+rch+1;

        int ld=d(root.left);
        int rd=d(root.right);

        return Math.max(curr,Math.max(ld, rd));
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Queue<Node> q = new LinkedList<>();
     int val=sc.nextInt();
     if(val==-1){
        System.out.println("Tree is Empty");//Edge case
     }
     Node root = new Node(val);
     q.add(root);
     while (true) { //while(!q.isEmpty())
        Node curr=q.poll();
        int l = sc.nextInt();
        if(l!=-1){
            Node n = new Node(l);
            curr.left=n;
            q.add(n);
        }
        else
            break;
        int r= sc.nextInt();
        if(r!=-1){
            Node n = new Node(r);
            curr.right=n;
            q.add(n);
        }
        else
            break;
     }
     System.out.print("Height from root:"+h(root));
     System.out.print("\nDiameter:"+d(root));
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
