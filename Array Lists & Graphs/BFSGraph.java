import java.util.*;
import java.util.LinkedList;

public class BFSGraph {
    public static void BFS(ArrayList<ArrayList<Integer>>graph,
    int v){
      boolean[] vis = new boolean[v];
      Queue<Integer> q = new LinkedList<>();
      q.add(0);
      vis[0] = true;
      System.out.print("BFS : ");
      while(!q.isEmpty()){
        int curr = q.poll();
        System.out.print(curr+" ");
        for(int i=0;i<graph.get(curr).size();i++){
          if(vis[graph.get(curr).get(i)]==false){
            q.add(graph.get(curr).get(i));
            vis[graph.get(curr).get(i)]=true;
          }
        }
      }
    }
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int v = sc.nextInt();
      if(v==0){
        System.out.print("Graph doesn't exist");
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
      BFS(graph,v);
      sc.close();
  }
}
