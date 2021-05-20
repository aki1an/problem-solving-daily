/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six;
import java.util.Scanner;
public class lco1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<15;i++)
            System.out.println((i+1)+" x "+n+" = "+(i+1)*n);
    }
}
