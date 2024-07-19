import java.util.*;
class AdjList
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int k=0;k<t;k++){
      int v= sc.nextInt();
        int e= sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<v;i++){ //to declare array list size we take v
            graph.add(new ArrayList<>());
        }
        
        for(int i = 0; i<e;i++){//to take input we take e
            int s = sc.nextInt();//source
            int d = sc.nextInt();//destination
            graph.get(s).add(d);
            graph.get(d).add(s);//undirected graph. this line is not needed for directed graph.
        }

        for(int i=0;i<v;i++){//traversing the array list
            System.out.print(i+"-> ");
          int j =0;
            for(j=0;j<graph.get(i).size()-1;j++){
                System.out.print(graph.get(i).get(j)+"-> ");
            }
            System.out.println(graph.get(i).get(j));
        }
    }
    sc.close();
  }
}