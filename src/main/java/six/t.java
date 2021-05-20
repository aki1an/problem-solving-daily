/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six;
import java.util.Scanner;
public class t{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int d=s.nextInt();
        printValue(n,d);
    }
    static void printValue(int n,int d){
        if(n%d==0){
            System.out.print(n/d);
        }else{
            int num=n/d;
            int rem=n%d;
            System.out.print(num+" "+rem+"/"+d);
        }
    }
}