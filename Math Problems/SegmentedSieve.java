import java.util.*;

class SegmentedSieve{
  
  // Function to perform the sieve of Eratosthenes
  public static void sieve(int limit, ArrayList<Integer> prime) {
    boolean[] marked = new boolean[limit + 1];
    Arrays.fill(marked, true);
    
    for (int i = 2; i * i <= limit; i++) {
      if (marked[i]) {
        for (int j = i * i; j <= limit; j += i) {
          marked[j] = false;
        }
      }
    }
    
    for (int i = 2; i <= limit; i++) {
      if (marked[i]) {
        prime.add(i);
        System.out.print(i + " ");
      }
    }
  }
  
  // Function to perform the segmented sieve
  public static void segmentedSieve(int n) {
    int limit = (int) Math.floor(Math.sqrt(n)) + 1;
    ArrayList<Integer> prime = new ArrayList<>();
    
    // Perform the sieve of Eratosthenes for the initial segment
    sieve(limit, prime);
    
    int low = limit;
    int high = 2 * limit;
    
    // Segmented sieve
    while (low < n) {
      if (high > n) {
        high = n;
      }
      
      boolean[] mark = new boolean[limit + 1];
      Arrays.fill(mark, true);
      
      for (int i = 0; i < prime.size(); i++) {
        int lowLim = (low / prime.get(i)) * prime.get(i);
        if (lowLim < low) {
          lowLim += prime.get(i);
        }
        
        for (int j = lowLim; j < high; j += prime.get(i)) {
          mark[j - low] = false;
        }
      }
      
      for (int i = low; i < high; i++) {
        if (mark[i - low]) {
          System.out.print(i + " ");
        }
      }
      
      low = low + limit;
      high = high + limit;
    }
  }
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    segmentedSieve(n);
    sc.close();
  }
}
