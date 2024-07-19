import java.util.*;
class DirectedCycle
{
  public static int find(int[] arr, int ele){
    if(ele==arr[ele])
      return ele;
    return find(arr,arr[ele]);
  }
  public static int cycle(ArrayList<Node> graph, int[] arr){
    for(int i=0;i<graph.size();i++){
      int sr=find(arr,graph.get(i).s);
      int dr=find(arr,graph.get(i).d);
     // System.out.println(sr+" "+dr);
      if(sr==dr)
        return 1;
      else{
        arr[sr]=dr;
      }
    }
    return 0;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int k=0;k<t;k++){
      int v= sc.nextInt();
      int e= sc.nextInt();
      ArrayList<Node> graph = new ArrayList<Node>();
      for(int i = 0;i<e;i++){
        int s = sc.nextInt();
        int d=sc.nextInt();
        graph.add(new Node(s,d));
      }
    
    int[] arr=new int[v];
    for(int i=0;i<v;i++){
      arr[i]=i;
    }
    System.out.println(cycle(graph,arr));
  }
  sc.close();
  }
}
class Node{
  int s,d;
  Node(int s, int d){
    this.s=s;
    this.d=d;
  }
}