import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = 0;
        int r =s.length()-1;
        boolean pal=true;
        while(l<r&&pal){
            if(s.charAt(l)!=s.charAt(r)){
                pal=false;
            }
            else{
                l++;
                r--;
            }
        }
        if(pal){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not a Palindrome"); 
        sc.close();
    }
}
