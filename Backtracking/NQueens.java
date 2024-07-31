package Backtracking;
import java.util.*;

public class NQueens {
    public static boolean isSafe(List<Integer>placement, int row, int col){
      for(int r=0;r<row;r++){
        if((placement.get(r)==col)||
        (Math.abs(placement.get(r)-col)==Math.abs(r-row)))return false;
        
      }
      return true;
    }
    public static void grid(int n, int row, List<List<Integer>>sol,
    List<Integer>placement){
      if(row==n){//goal
        sol.add(new ArrayList<>(placement));
        return;
      }
      for(int col=0;col<n;col++){//exploration
        if(isSafe(placement,row,col)){//exploration
          placement.set(row,col);//Action or do
          grid(n,row+1,sol,placement);//recursive
          placement.set(row,-1);//Backtracking or Undo
        }
      }
    }
    public static List<List<Integer>> nQueens(int n){
      List<List<Integer>> sol = new ArrayList<>();
      List<Integer> placement = new ArrayList<>();
      for(int i=0;i<n;i++){
        placement.add(-1);
      }
      grid(n,0,sol, placement);
      return sol;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      List<List<Integer>> sol = nQueens(n);
      
      if(sol.isEmpty()){
        System.out.print("-1");
      }
      else{
        for(List<Integer> ans:sol){
          System.out.print("[");
          for(int i=0;i<n;i++){
            System.out.print((ans.get(i)+1)+" ");
          }System.out.print("]");
        }System.out.println();
      }
      sc.close();
  }
}