
package Problem_Solving;

/**
 *
 * @author Akilan
 * 81. Print the total number of odd and even digits in the given number.
  Ex.  Input  :  1234567
      Output  :  ODD 4
                 EVEN 3
 */
import java.util.Scanner;
public class Qn__81th__oddece {
    public static void main(String args[]){
       Scanner s =new Scanner(System.in);
       int n = s.nextInt();
       int odd=0,even=0;
       while(n!=0){
           int dig = n%10;
           n/=10;
          
           if(dig%2==0) even++;
           else odd++;
       }
       System.out.print("ODD : "+odd+"\nEVEN : "+even);
    }
}
