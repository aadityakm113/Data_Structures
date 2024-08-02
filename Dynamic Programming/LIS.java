//Longest Increasing subsequence
import java.util.*;
class LIS
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int[] dp = new int[n];
    for(int i =0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i =0;i<n;i++){
      dp[i]=1;
    }
    int max=0;
    for(int i =1;i<n;i++){
      for(int j=i-1;j>=0;j--){
        if(arr[i]>=arr[j]){
          dp[i]=Math.max(dp[i],dp[j]+1);
        }
      }
      if(max<dp[i])
        max=dp[i];
    }
    System.out.println(max);
    sc.close();
  }
}