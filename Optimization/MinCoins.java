package Optimization;
import java.util.*;
class MinCoins
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] ={1,2,5,10,20,50,100,500,1000};
    int i=8;
    while(n!=0){
      if(n>=arr[i]){
        System.out.print(arr[i]+"  ");
        n-=arr[i];
      }
      else
        i--;
    }
    sc.close();
  }
}