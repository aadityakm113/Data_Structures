package Optimization;
import java.util.*;

public class PoliceAndThief {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next().charAt(0);
        }
        int k = scanner.nextInt();
        System.out.println("Maximum thieves caught: " + policeThief(arr, n, k));
        scanner.close();
    }

    public static int policeThief(char[] arr, int n, int k) {
        int res = 0;
        List<Integer> thi = new ArrayList<>();
        List<Integer> pol = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P')
                pol.add(i);
            else if (arr[i] == 'T')
                thi.add(i);
        }
        int l = 0, r = 0;
        while (l < thi.size() && r < pol.size()) {
            if (Math.abs(thi.get(l) - pol.get(r)) <= k) {
                res++;
                l++;
                r++;
            }

            // increment the minimum index 
            else if (thi.get(l) < pol.get(r))
                l++;
            else
                r++;
        }

        return res;
        
    }
}