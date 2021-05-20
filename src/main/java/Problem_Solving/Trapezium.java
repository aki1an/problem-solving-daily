package Problem_Solving;

import java.util.Scanner;
public class Trapezium {
  public static void main(String args[]){
      
  
    Scanner s= new Scanner(System.in);
    int val = 1,od = 1,tot=0;
    int n = s.nextInt();
 
        for(int i=0;i<n;i+=1,System.out.print("\n")){
       
            for(int j=i;j>=0;j--){
                if(i%2==0)
               System.out.print(" "+od--+" ");
                else
                    System.out.print(" "+od+++" ");
            }
            
            if(i%2==0)
                od +=i+1+1;
            else
                od+=i+1;
        }
    
    }
}