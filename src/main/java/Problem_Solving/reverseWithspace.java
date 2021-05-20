package Problem_Solving;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
public class reverseWithspace {
    
    public static void main(String args[]){
        Scanner s= new Scanner (System.in);
        
        String str = s.nextLine();
        int n= str.length();
        String an = "";int ind=0;
        for(int i=n-1;i>=0;i--){
            if(str.charAt(i)!=' ')
                an+=str.charAt(i);
        }
        for(int i=0;i<n;i++){
            if(str.charAt(i)==' '){
                System.out.print(" ");
                continue;
            }
            System.out.print(an.charAt(ind));
            ind++;
            
        }
    }
}
