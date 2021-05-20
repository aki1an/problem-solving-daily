/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem_Solving;

/**
 *
 * @author Akilan
 * 
 * 
 * 
 */
import java.util.Scanner;
public class QN__66__Add_dig_number {
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int dig = s.nextInt();
        int n = s.nextInt();
        int rev = 0;
        while(n!=0){
            int d = n%10;
            n/=10;
            rev = rev*10+d;
        }        
        while(rev!=0){
            int d = rev%10;
            rev/=10;
            System.out.print(d+dig);           
        }
    }
}
