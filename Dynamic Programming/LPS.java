import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String rev ="";
    int l=s.length();
    for(int i=l-1;i>=0;i--){
      rev+=s.charAt(i);
    }
    int[][] dp =new int [l+1][l+1];
    for(int i=0;i<=l;i++){
      for(int j=0;j<=l;j++){
        if(i==0||j==0){
          dp[i][j]=0;
        }
        else if(s.charAt(i-1)==rev.charAt(j-1)){
          dp[i][j]=dp[i-1][j-1]+1;
        }
        else{
          dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        }
      }
    }
    System.out.println(dp[l][l]);
    sc.close();
  }
}