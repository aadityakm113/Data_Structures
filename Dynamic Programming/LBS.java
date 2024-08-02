//Longest bitonic subsequence
import java.util.*;

public class LBS {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int k=0;k<t;k++){
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        int[] dp2 = new int[n];
        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
          dp[i] = 1;
          dp2[i] = 1;
        }
        //LIS
        int max = 0;
        for(int i=1;i<n;i++){
          for(int j=i-1;j>=0;j--){
            if(arr[j]<arr[i]){
              dp[i] = Math.max(dp[i],dp[j]+1);
              
            }
          }
        }
        //LDS
        for(int i=n-2;i>=0;i--){
          for(int j=i+1;j<n;j++){
            if(arr[j]<arr[i]){
              dp2[i] = Math.max(dp2[i],dp2[j]+1);
              
            }
          }
        }
        for(int i=0;i<n;i++){
          max = Math.max(max,(dp[i]+dp2[i]-1));
          //System.out.print(dp2[i]+" ");
        }
        System.out.println(max);
      }
      sc.close();
  }
}