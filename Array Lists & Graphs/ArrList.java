import java.util.*;
public class ArrList {
    public static void main(String[] args) {
        //1D array
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        
        // for(int i=0;i<4;i++){
        //     System.out.print(arr.get(i)+" ");
        // }

        //2D Array
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i =0;i<4;i++){
            arr.add(new ArrayList<>());
        }
        arr.get(0).add(1);
        arr.get(0).add (2);
        arr.get(1).add(3);
        arr.get(1).add(4);
        arr.get(2).add(0);
        arr.get(2).add(1);
        arr.get(3).add(8);
        arr.get(3).add(9);
        for(int i =0;i<4;i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
