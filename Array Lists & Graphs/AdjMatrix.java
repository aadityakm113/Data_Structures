import java.util.*;
public class AdjMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of nodes in the graph");
        int v = sc.nextInt();
        System.out.println("Please enter the number of edges in the graph");
        int e = sc.nextInt();
        System.out.println("Is the graph directed");
        String str = sc.next();
        int[][] graph = new int[v][v];
        System.out.println("Adjacency Matrix Representation:");
        for(int i=0;i<v;i++){
        for(int j=0;j<v;j++){
            System.out.print(graph[i][j]+" ");
        }
        System.out.println();
        }
        for(int i =0;i<e;i++){
        System.out.println("Enter the start node, end node and weight of edge no "+(i+1));
        int s=sc.nextInt();
        int d=sc.nextInt();
        int w=sc.nextInt();
        
        graph[s-1][d-1]=w;
        if(str.equals("no"))
            graph[d-1][s-1]=w;
        }
        System.out.println("Adjacency Matrix Representation:");
        for(int i =0;i<e;i++){
        for(int j =0;j<e;j++){
            System.out.print(graph[i][j]+" ");
        }
        System.out.println();
        }
        sc.close();
    }
}
