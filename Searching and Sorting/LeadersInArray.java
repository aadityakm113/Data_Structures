import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int t = sc.nextInt();
    for(int k =0;k<t;k++){
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      ArrayList<Integer> leader = new ArrayList<>(); 
    int max = arr[n-1];
    leader.add(arr[n-1]);
    for(int i=n-2;i>=0;i--){
      if(arr[i]>=max){
        max=arr[i];
        leader.add(arr[i]);
      }
    }
    for(int i=leader.size()-1;i>=0;i--){
      System.out.print(leader.get(i)+ " ");
    }
    System.out.println();
    }
    sc.close();
  }
}