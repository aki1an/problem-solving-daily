package Problem_Solving;

import java.util.Scanner;
public class Qn__46__Diamond_Pattern {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i=0;i<n;i++){
            
            for(int sp = 0;sp<n-i;sp++)
               System.out.print(" ");
           
            for(int j=0;j<2*i+1;j++)
                System.out.print("*");
            
            System.out.print("\n\n");            
        }
        for(int i=n-2;i>=0;i--){
            
            for(int sp = 0;sp<n-i;sp++)
               System.out.print(" ");
           
            for(int j=0;j<2*i+1;j++)
                System.out.print("*");
            
            System.out.print("\n\n");            
        }
      
        
        
    }
}
