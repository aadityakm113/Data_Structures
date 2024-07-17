package Queues;

import java.util.*;


public class Reverse {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Queue<Integer> q = new LinkedList();
    Stack<Integer> s =new Stack<>();
    
    while(true){
      int val = sc.nextInt(); 
      if(val<0)
        break;
      q.offer(val);
    }
    sc.close();
    if(q.isEmpty()){
      System.out.println("Queue is empty");
      return;
    }
    System.out.println("Before reversing:");
    while(!q.isEmpty()){
      int e = q.poll();
      System.out.print(e+" ");
      s.push(e);
    }
    
    System.out.println();
    System.out.println("After reversing:");
    while(!s.isEmpty()){
      q.add(s.pop());
      int e= q.poll();
      System.out.print(e+" ");
    }
    
   } 
}
