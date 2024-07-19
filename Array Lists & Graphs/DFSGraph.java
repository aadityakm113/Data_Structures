import java.util.*;

public class DFSGraph {
    public static void DFS(ArrayList<ArrayList<Integer>>graph,boolean[] vis,int curr){
        System.out.println(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph.get(curr).size();i++){
            int vertex=graph.get(curr).get(i);
            if(!vis[vertex]){
                DFS(graph,vis, vertex);
            }
        }
    }
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int v = sc.nextInt();
      if(v==0){
        System.out.print("Graph doesn't exist");
        return;
      }
      ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
      for(int i=0;i<v;i++){
        graph.add(new ArrayList<>());
      }
      while(true){
        int s = sc.nextInt();
        int d = sc.nextInt();
        if(s==-1 && d==-1)break;
        graph.get(s).add(d);
        graph.get(d).add(s);
      }
      boolean[] vis= new boolean[v];
      for(int i=0;i<v;i++){
        if(vis[i]==false){
            DFS(graph, vis, i);
        }
      }
      sc.close();
  }
}
