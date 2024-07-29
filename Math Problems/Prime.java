import java.util.*;
class Prime
{
  public static void isPrime(int n){
    boolean flag=true;
    if(n==0 || n==1)
      System.out.println("Given number is not a prime number");
    for(int i=2;i<Math.sqrt(n);i++){
      if(n%i==0)
        flag=false;
    }
    if(flag)
      System.out.println("Given number is a prime number");
    else
      System.out.println("Given number is not a prime number");
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int x=sc.nextInt();
    isPrime(x);
    sc.close();
  }
}