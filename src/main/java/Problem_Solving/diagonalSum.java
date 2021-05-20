package Problem_Solving;

import java.util.Scanner;

public class diagonalSum {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int ar[][] = new int[row][col]; 
        int sum = 0, sum2 =0;
        
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++){
                ar[i][j]=s.nextInt();
                
                if(i+j<=row)
                    sum+=ar[i][j];
                
                if(i+j>=row-1)
                    sum2+=ar[i][j];
                
            }
        
        System.out.print(sum+" "+sum2);
        
        
        
    }
}
