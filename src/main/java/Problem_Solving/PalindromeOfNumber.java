package Problem_Solving;

import java.util.Scanner;
public class PalindromeOfNumber {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int no = n;
        int rem = 0;
        int ans = 0;
        int hnd = 10;
        
        while(n%hnd!=n)
            hnd *=10;
        
        System.out.println("hund "+hnd);
        while(n!=0){
            
            rem = n%10;
            n/=10;
            ans = ans*10+rem;
            System.out.println(rem*hnd);
        }
        if(ans==no)
        System.out.println(".>>pal");
        else
            System.out.print("not pal");
    }
}
