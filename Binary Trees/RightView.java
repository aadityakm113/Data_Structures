import java.util.*;
import java.util.LinkedList;

public class RightView {
    public static void view(Node root){
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
        int s = q.size();
        for(int i=0;i<s;i++){
          Node curr = q.poll();
          if(i==s-1){
            System.out.print(curr.data+" ");
          }
          if(curr.left!=null){
            q.add(curr.left);
          }
          if(curr.right!=null){
            q.add(curr.right);
          }
        }
      }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Queue<Node>q = new LinkedList<>();
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
      view(root);
      sc.close();
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