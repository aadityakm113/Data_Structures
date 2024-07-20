import java.util.*;
public class Pq {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        
        // pq.add(10);
        // pq.add(1);
        // pq.add(3);
        // pq.add(5);
        // System.out.println(pq);
        // pq.poll();
        // pq.remove(5);
        // System.out.println(pq);
        // System.out.println(pq.poll());
        // System.out.println(pq.remove());
        // System.out.println(pq);
        // System.out.println(pq.size());
        // System.out.println(pq.peek());

        // printing in ascending order
        // ArrayList<Integer> arr = new ArrayList<>();

        // arr.add(1);
        // arr.add(10);
        // arr.add(3);
        // arr.add(5);
        
        // for(int i=0;i<4;i++){
        //     int ele=arr.get(i);
        //     System.out.println(ele+" ");
        // }
        // PriorityQueue<Integer> pq = new PriorityQueue<>(arr);
        // System.out.println("Priority Queue elements: ");
        // while(!pq.isEmpty()){
        //     // System.out.println(pq.remove());//returns exception
        //     System.out.println(pq.poll());//returns null
        // }

        //Reverse Order
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
       
        pq.add(10);
        pq.add(1);
        pq.add(3);
        pq.add(5);
        
        while(!pq.isEmpty()){
                System.out.println(pq.poll());//returns null
            }
    }
}
