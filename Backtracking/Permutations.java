package Backtracking;
import java.util.*;
class Permutations
{
    static ArrayList<String> arr = new ArrayList<>();
    public static void permute(boolean[] used,int n,String s,String str){
        if(str.length()==n){//goal
            arr.add(str);
            return;
        }
        for(int i=0;i<n;i++){//exploration
            if(used[i]==false){
                used[i]=true;//action/do
                permute(used, n, s, str+s.charAt(i));//recursive call
                used[i]=false;//backtracking or undo
            }
        }
    }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s= sc.next();
    int n=s.length();
    boolean[] used = new boolean[n];
    permute(used,n,s,"");
    Collections.sort(arr);
    for(int i=0;i<arr.size();i++){
        System.out.println(arr.get(i));
    }
    sc.close();
  }
}