package Optimization;
import java.util.*;

public class MinSumProductArray {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a1 = new int[n];
      int[] a2 = new int[n];
      for(int i=0;i<n;i++){
        a1[i] = sc.nextInt();
      }
      
      for(int i=0;i<n;i++){
        a2[i] = sc.nextInt();
      }
      int k = sc.nextInt();
      int fin=0, d=0;
      for(int i=0;i<n;i++){
        int og_p = a1[i]*a2[i];
        fin = fin+(og_p);
        int p = 0;
        if(og_p<0 && a1[i]>0){
          a1[i] = a1[i]+(2*k);
          p = a1[i]*a2[i];
        }
        else if(og_p<0 && a1[i]<0){
          a1[i] = a1[i]-(2*k);
          p = a1[i]*a2[i];
        }
        else if(og_p>0 && a1[i]>0){
          a1[i] = a1[i]-(2*k);
          p = a1[i]*a2[i];
        }
        else if(og_p>0 && a1[i]<0){
          a1[i] = a1[i]+(2*k);
          p = a1[i]*a2[i];
        }
        d = Math.max(d,Math.abs(og_p-p));
      }
      System.out.print(fin-d);
      sc.close();
  }
}






