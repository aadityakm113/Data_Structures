package Searching;
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int x= sc.nextInt();
    for(int i=0;i<n;i++){
      if(arr[i]==x){
        System.out.println(x+" is present at location "+(i+1)+".");
        return;
      }
    }
    sc.close();
    System.out.println("Not found");
    sc.close();
  }
}