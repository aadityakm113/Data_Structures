package Optimization;

import java.util.*;
public class Jump2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr= new int[n];
    for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int count=0;
    int m=0,M=0;
    
    while(M<n-1){
        int max=M;
        for(int i=m;i<=M;i++){
            if((i+arr[i])>max){
                max=i+arr[i];
            }
        }
        count++;
        m=M+1;
        M=max;
    }
    System.out.print(count);
    sc.close();
   } 
}
