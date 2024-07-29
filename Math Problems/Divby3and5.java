import java.util.*;
class Divby3and5{
  public static void SumNumbersDivisible(int m,int n){
    int sum =0;
    for(int i=m;i<n;i++){
      if(i%3==0&&i%5==0){
        sum+=i;
      }
    }
    System.out.println(sum);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int m =sc.nextInt();
    int n=sc.nextInt();
    SumNumbersDivisible(m,n);
    sc.close();
  }
}