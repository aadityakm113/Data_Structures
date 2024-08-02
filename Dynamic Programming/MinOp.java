//return minimum no.of operations required to convert word1 to word2
import java.util.*;
public class MinOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int l1=s1.length();
        int l2=s2.length();
        int[][]dp = new int[l1+1][l2+1];
        for(int i=0;i<=l1;i++){
            for(int j=0;j<=l2;j++){
                if(i==0 || j==0){
                    dp[i][j]=i+j;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];//diagonal value 
                }
                else{
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;//behind,above and previous diagonal
                }
            }
        }
        System.out.println(dp[l1][l2]);
        sc.close();
    }
}
