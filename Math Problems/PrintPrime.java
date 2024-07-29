import java.util.*;
class PrintPrime
{
  public static void isPrimePrint(int n ){
    int prime;
    for(int i=2;i<=n;i++){
      prime=1;
      for(int j=2;j<=Math.sqrt(i);j++){
        if(i%j==0){
          prime =0;
          break;
        }
    }
      if(prime==1)
        System.out.print(i+ " ");
    }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    isPrimePrint(x);
    sc.close();
  }
}