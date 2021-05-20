/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six;
import java.util.Scanner;
public class countNumbers {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long temp = n;int count=0;
        for(int i=0;i<=9;i++){
            n = temp;
            while(n!=0){
               long rem = n%10;
               if(rem==i)
                   count++;
               n/=10;
            }
            
            System.out.println(i+" occurs "+count);
            count = 0;
            
        }
    }
}
