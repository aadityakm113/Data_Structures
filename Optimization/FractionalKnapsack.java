package Optimization;
import java.util.*;
public class FractionalKnapsack {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[]p=new double[n];
    double[]w=new double[n];
    for(int i =0;i<n;i++){
        p[i]=sc.nextInt();
    }
    for(int i =0;i<n;i++){
        w[i]=sc.nextDouble();
    }
    int k=sc.nextInt();
    double[] fp = new double[n];
    for(int i=0;i<n;i++){
        fp[i]=p[i]/w[i];
    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            double temp =fp[i];
            fp[i]=fp[j];
            fp[j]=temp;

            double temp2 = p[i];
            p[i]=p[j];
            p[j]=temp2;

            double temp3 = w[i];
            w[i]=w[j];
            w[j]=temp3;
        }
    }
    double profit=0;
    int i=0;
    while(k>=w[i]){
        profit+=p[i];
        k-=w[i];
        i++;
    }
    profit+=k*fp[i];
    System.out.printf("%.2f",profit);
    sc.close();
   }
}
