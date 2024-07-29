import java.util.*;
class Factors
{
  public static void factors(int n){
    for(int i=1;i<=Math.sqrt(n);i++){
      if(n%i==0){
        System.out.print(i+" ");
        if(i!=n/i)
          System.out.print(n/i+" ");
      }
    }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    factors(x);
    sc.close();
  }
}