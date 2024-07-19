//Number of edges in a complete graph
import java.util.*;
class NumOfEdgesGraph 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int total = (n*(n-1))/2;
    System.out.println(total);
    
  }
}