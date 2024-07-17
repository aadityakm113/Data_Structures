package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Methods {
   public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(10);
    q.offer(22);
    q.add(65);
    q.poll();
    System.out.println(q);
    System.out.println(q.size());
   } 
}
