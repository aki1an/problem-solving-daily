
package six;

/**
 *
 * @author Akilan
 */
import java.util.Scanner;
public class leftRotation {
   public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int N = n;
       int k = 10,si = 1,c=1;
       while(n%k!=n){ k*=10; c++;}
       
       int l = n%10;
       int ans  = (n/(k/10))* k/10 + l;
       System.out.print(ans+"  "+k);
       
       
   } 
}
