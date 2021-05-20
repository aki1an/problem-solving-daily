/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoho;

import java.util.Scanner;
public class spaceIntact {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        char ar[] = str.toCharArray();
        int start =0,end = ar.length-1;
        while(start<end){
            if(ar[start]==' ') start++;
            if(ar[end]  ==' ') end--;
            
            if(ar[start]!=' ' && ar[end]!=' ')
            {
                char temp = ar[start];
                ar[start] = ar[end];
                ar[end] =  temp;
                start++;
                end--;
            }
        }
        System.out.print(String.valueOf(ar));
        
        
        
    }
}
