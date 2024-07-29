import java.util.*;
class SieveOfEratosthenes
{
  public static void sieve(int n ){
    boolean[] prime = new boolean[n+1];
    Arrays.fill(prime,true);
    
    //mark multiples of the prime number as false
    for(int i=2;i*i<=n;i++){
      if(prime[i]){
        for(int j=i*i;j<=n;j+=i){
          prime[j]=false;
        }
      }
    }
    
    //traverse the array and print the indexes of the true values
    for(int i=2;i<=n;i++){
      if(prime[i]){
        System.out.print(i+" ");
      }
    }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sieve(n);
    sc.close();
  }
}