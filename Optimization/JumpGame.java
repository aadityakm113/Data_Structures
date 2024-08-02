package Optimization;
import java.util.*;
public class JumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int d = n-1;
        for(int i = n-2;i>=0;i--){
            if(i+arr[i]>=d)
                d=i;
        }
        if(d==0)
            System.out.println("True");
        else
            System.out.println("False");

        sc.close();
    }
}
