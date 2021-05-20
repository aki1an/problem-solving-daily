package Problem_Solving;

import java.util.Scanner;
public class diamond {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int val = 0;
        for(int i=0;i<n;i++){
            val+=i+1;
            for(int sp = n-1;sp>i;sp--){
                System.out.print(" ");
            }
            int temp = val;
            for(int j=0;j<=i;j++){
                System.out.print(temp--+" ");  
            }
            System.out.println();
    
        }
        int x = val;
        for(int i=0;i<n;i++){
           
            for(int sp = 0;sp<i;sp++){
                System.out.print(" ");
            }
           
            for(int j=i;j<n;j++){
                System.out.print(x--+" ");  
            }
            System.out.println();
    
        }
    }
}
