import java.util.*;
import java.util.LinkedList;
class Main {
    public static void main(String[] args) {
        // Queue<Node> q= new LinkedList<>();
        // Node n = new Node(1,10);
        // q.add(n);
        // for(int i =0;i<2;i++){
        //     System.out.println(q.poll().first);
        // }
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        Node n = new Node(1,10);
        pq.add(n);
        n= new Node(3, 24);
        pq.add(n);
        n= new Node(2,8);
        pq.add(n);
        for(int i =0;i<3;i++){
            //System.out.println(pq.poll().first);
            System.out.println(pq.poll().second);
        }
    }
}
class Node implements Comparable<Node>{
    int first,second;
    Node(int f,int s){
        first=f;
        second=s;
    }
    public int compareTo(Node other){
        return Integer.compare(this.first,other.first);
    }
}