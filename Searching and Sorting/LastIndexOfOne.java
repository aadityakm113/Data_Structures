import java.util.*;
class LastIndexOfOne
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i =0;i<t;i++){
      boolean found =false;
      String s= sc.next();
      int length =s.length();
      
      for(int j=0;j<length&&!found;j++){
        if(s.charAt(length-j-1)=='1'){
          found=true;
          System.out.println(length-j-1);
        }
      }
      if(!found)
        System.out.println("-1");
    }
    sc.close();
  }
}