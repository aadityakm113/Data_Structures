import java.util.ArrayList;
import java.util.Scanner;
public class WeightAdjList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        for(int i=0;i<v;i++){
            graph.add(new ArrayList<>());
        }
        while(sc.hasNextInt()){
            int s = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();
            graph.get(s).add(new Node(s, d, w));
            graph.get(d).add(new Node(d, s, w));
        }
        for(int i=0;i<v;i++){
            System.out.println("Vertex "+i+": ");
            for(int j=0;j<graph.get(i).size();j++){
                Node n = graph.get(i).get(j);
                System.out.println("D: "+n.d+"W:"+n.w);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
class Node{
    int s,d,w;
    Node(int s,int d, int w){
        this.s=s;
        this.d=d;
        this.w=w;
    }
}