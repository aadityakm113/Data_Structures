// Given two positive numbers, N and D. Write a program to count the numbers smaller than N. Such that the difference between the number and sum of its digits is greater than, or equal to the given specific value D.



// Format:

// Input:

// The first line of input contains a single integer T which denotes the number of test cases. Then T test cases follow. The first line of each test case contains two space-separated integers N and D.

// Output:

// For each test case, print the count of numbers smaller than N. Such that the difference between the number and sum of its digits is greater than, or equal to D.


import java.util.*;
class AllNumbersWithSpecificDifference
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d= sc.nextInt();
    int count=0;
    for(int i=0;i<=n;i++){
      int sum=0;
      int copy=i;
      while(copy>0){
        sum+=(copy%10);
        copy/=10;
      }
      if(i-sum>=d){
        count++;
      }
    }
    System.out.println(count);
    sc.close();
  }
}