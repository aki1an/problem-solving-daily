package Problem_Solving;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akilan
 */
import java.util.Scanner;
public class islandOrNot {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[][] = new int[n][n];
        int islands = 0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++) arr[i][j]=s.nextInt();
        
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                if(arr[i][j]==1){
                    
                    if( i+1<n && i-1<n && j-1<n && j+1<n)
                        
                    if(arr[i+1][j]==-1 && arr[i-1][j]==-1 && arr[i][j-1]==-1 && arr[i][j+1]==-1){
                        islands++;
                        System.out.println("( "+i+" , "+j+" )"+" island no : "+islands);
                    }
                }
            }
        }
                 
        
    }
}
