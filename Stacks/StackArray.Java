import java.util.Scanner;
public class StackArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000];
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        for(int i=n;i<n+m;i++){
            arr[i]=sc.nextInt();
        }
        int del1=sc.nextInt();
        int del2=sc.nextInt();

        System.out.println("Stack 1 Elements:");
        for (int i=n-1;i>=0;i--){
            System.out.println(arr[i]+" ")
        }
        

    }
}