import java.util.*;
import java.util.LinkedList;
public class BuyTicket {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      //create array list and add elements
      ArrayList<Integer> arr = new ArrayList<>();
      for(int i=0;i<n;i++){
        arr.add(sc.nextInt());
      }
      int pos = sc.nextInt();
      Queue<Pair> q = new LinkedList<>();
      //push arr elements in priority queue
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      for(int i=0;i<n;i++){
        pq.add(arr.get(i));
        //push pair of element and index in queue
        Pair node = new Pair(arr.get(i),i);
        q.add(node);
      }
      int time = 0;
      while(true){
        if(pq.peek()==q.peek().ele){
            time++;
            if(pos==q.peek().index)
                break;
            pq.poll();
            q.poll();
        }
        else{
            Pair node =q.poll();
            q.add(node);
        }
      }
      System.out.println(time);
    } 
}
class Pair{
    int ele,index;
    Pair(int e,int i){
        ele=e;
        index=i;
    }
}
