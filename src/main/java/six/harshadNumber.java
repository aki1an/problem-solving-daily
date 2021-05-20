/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six;
import java.util.Scanner;
public class harshadNumber {
    /*
     sum of digits of given number perfectly divides number 
    ---> harshad Number
    ---> ! harshad numbver
    
    */
    
    
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt(),n2 = n;
       
        int sum = 0;
        while(n2!=0){
            int rem = n2%10;
            n2/=10;
            sum +=rem;
        }
        System.out.print((n/sum)*sum==n?"harshad Number":"not a harshad Number");
            
    }
}
