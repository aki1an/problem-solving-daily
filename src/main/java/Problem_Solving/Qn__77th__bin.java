/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem_Solving;
import java.util.Scanner;
public class Qn__77th__bin {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
       
            for(int i=0;;i++){
                int temp = i;
                int d = n;
                String ans="";
                int count = 0;
                while(d-->0){
                    
                    int dig = temp%2;
                    temp /=2;
                    if(dig==1)
                        count++;
                   ans+=dig;
                }
                for(int k=ans.length()-1;k>-1;k--){
                   System.out.print(ans.charAt(k));
                }
                if(count==n)
                break; 
                
                System.out.println();
            }
            System.out.println();
        
    
    }
}
