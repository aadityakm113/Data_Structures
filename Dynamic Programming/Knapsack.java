import java.util.*;
public class Knapsack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] w = new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++){
            w[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int[][] dp = new int[n+1][k+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                if(w[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],p[i-1]+dp[i-1][j-w[i-1]]);
                }
            }
        }
        System.out.println(dp[n][k]);
        sc.close();
    }
}
