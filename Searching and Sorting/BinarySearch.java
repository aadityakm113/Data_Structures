import java.util.*;

public class BinarySearch {
    public static int bs(int[] arr, int key){
      int s = 0;
      int e = arr.length-1;
      while(s<=e){
        int mid = (s+e)/2;
        if(arr[mid]==key)return mid+1;
        else if(arr[mid]<key)s = mid+1;
        else e = mid-1;
      }
      return -1;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      int key = sc.nextInt();
      int indx = bs(arr,key);
      if(indx!=-1)
      System.out.println(key+" is present at location "+indx);
      else
      System.out.print("Not found");
      sc.close();
  }
}