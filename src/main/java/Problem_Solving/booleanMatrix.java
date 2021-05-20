package Problem_Solving;

import java.util.Scanner;
public class booleanMatrix{
   public static void main(String args[]){
       Scanner s  =new Scanner(System.in);
       int n = s.nextInt();int m = s.nextInt();
       int arr[][] = new int[n][m];
       
       for(int i=0;i<n;i++)
           for(int j=0;j<m;j++)
               arr[i][j]=s.nextInt();
       
        var res = new int[n][m];
        
        for(int i=0;i<n;i++)
           for(int j=0;j<m;j++)
               if(arr[i][j]==1)
                  res = balance(res,i,j,n,m);
       
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               System.out.print(res[i][j]);
           }
           System.out.print("\n");
       }
   
   
   }
   
   static int [][]balance(int arr[][],int tr,int tc, int n,int m){
       System.out.println(">> : "+tr+"<< : "+tc);
       for(int i=0;i<n;i++)
           arr[i][tc]=1;
        for(int i=0;i<m;i++)
           arr[tr][i]=1;
       
       
       return arr;
       
   }
}