import java.util.PriorityQueue;
import java.util.Scanner;

public class Kruskal {

    public static int loop(int e,int[]uf){
        if(e==uf[e])
            return e;
        else
            return loop(uf[e],uf);
    }
    public static boolean kruskal(Edge node,int[]uf){
        int sr= loop(node.s,uf); //source return 
        int dr= loop(node.d,uf) ; //destination return
        if(sr!=dr){
            uf[sr]=dr;
            return false;
        }
        else
            return true;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PriorityQueue<Edge> pq =new PriorityQueue<>();
    int sum=0;
    int n = sc.nextInt();
    int [][]arr=new int[n][n];
    for(int i =0;i<n;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(arr[i][j]!=0){
                pq.add(new Edge(i,j,arr[i][j]));
                arr[j][i]=0;
            }
        }
        int[] uf = new int[n];
        for(int k=0;k<n;k++){
            uf[k]=k;
        }
        while(!pq.isEmpty()){
            Edge node = pq.poll();
            if(!kruskal(node,uf)){
                sum+=node.w;
            }
        }
        System.out.println(sum);
    }
    sc.close();
   } 
}
class Edge implements Comparable<Edge>{
    int s,d,w;
    Edge(int s,int d,int w){
        this.s=s; //source
        this.d=d; //destination
        this.w=d; //weight
    }
    public int compareTo(Edge one){
        return Integer.compare(this.w, one.w);
    }
}
