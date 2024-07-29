// Azad’s mother gave him Rs 100, so he decided to buy some chocolates. He went to a shop and that shop only has chocolates of Rs 3 and 7, so it now depends on Azad’s mood that how many chocolates he will buy. Maybe he will not buy single chocolate. Can you tell whether he has visited the same shop, from the remaining amount? If N (0 ≤ N ≤ 100) is equal to the possible remaining amount he has after he came from that shop, then print 1 or else 0.
import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            boolean found = false;
            
            for (int a = 0; a * 3 <= 100; a++) {
                for (int b = 0; a * 3 + b * 7 <= 100; b++) {
                    if (100 - (a * 3 + b * 7) == N) {
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
            
            if (found) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }
}
