import java.util.*;
class Main
{
  public static void isPrime(int n){
    int sum=0;
    boolean flag= true;
    for(int i=2;i<Math.sqrt(n);i++){
      if(n%i!=0)
        flag=false;
      if(flag){
        sum+=i;
      }
    }
    System.out.println(sum);
  } 
  public static void factors(int n){
    for(int i=1;i<=Math.sqrt(n);i++){
      if(n%i==0){
        isPrime(i);
        if(i!=i/n)
          isPrime(n/i);
      }
    }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    factors(x);
  }
}