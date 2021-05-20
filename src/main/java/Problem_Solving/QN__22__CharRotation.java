package Problem_Solving;

/**
 *
 * @author Akilan
 * 
 22.Given N. print the Latin Matrix (say N = 3).
    condition:  must not use strings(aka character literals),
    arrays (both 1D and 2D), inbuilt functions(like rotate).

input : 3

output:
        A   B   C
        B   C   A
        C   A   B

 */
import java.util.Scanner;

public class QN__22__CharRotation {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int val = 0;
        
        for(int i=0;i<n;i++){
             val=65+i;
            for(int j=0;j<n;j++){
                System.out.print((char)val+++" ");
            if(val>65+n-1)val=65;
            }
            
            System.out.println();
        }
       

    }
}
