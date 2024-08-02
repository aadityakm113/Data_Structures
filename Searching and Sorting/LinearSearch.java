// Given an array of positive integers. Your task is to find the leaders in the array.

// Note: An element of an array is a leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader. 
// Input:

// 3

// 6

// 16 17 4 3 5 2

// 5

// 1 2 3 4 0

// 5

// 7 4 5 7 3

// Output:

// 17 5 2

// 4 0

// 7 7 3

// Explanation:

// Test case 3: All the elements on the right of 7 (at index 0) is smaller than or equal to 7. Also, all the elements on the right side of 7 (at index 3) are smaller than 7. And, the last element 3 is itself a leader since no elements are to its right.



import java.util.*;
class LinearSearch
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
    sc.close();
    for(int i=0;i<n;i++){
      if(arr[i]==x){
        System.out.println(x+" is present at location "+(i+1)+".");
        return;
      }
    }
    System.out.println("Not found");
    
  }
}