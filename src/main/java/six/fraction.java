/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six;
import java.util.Scanner;

public class fraction {

    static void printValue(int n,int d){
        int l = n>d?n:d;
        int nn = n,dd=d;
        for(int i=2;i<l;i++){
            if(n%i==0&&d%i==0){
                n/=i;
                d/=i;
            }
        }
       
        if(d!=1){
            int temp = n/d;
            int valn = n-temp*d;
            System.out.print(temp+" "+valn+"/"+d);
        }
         else
            System.out.print(n);
        
    }
    
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int denominator  = s.nextInt();
        printValue(n,denominator);
    }
}
