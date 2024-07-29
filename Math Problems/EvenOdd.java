import java.util.*;
public class EvenOdd {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if((n & 1)!=0)
        System.out.println("Odd");
    else
        System.out.println("Even");
    sc.close();
   } 
}
