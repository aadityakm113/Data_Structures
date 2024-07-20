import java.util.*;

public class HeapSort {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> arr= new ArrayList<>();
    for(int i =0;i<n;i++){
      arr.add(sc.nextInt());
    }
    PriorityQueue<Integer> pq = new PriorityQueue<>(arr);
    while(!pq.isEmpty()){
      System.out.print(pq.poll()+" ");
    }
    sc.close(); 

   } 
}
