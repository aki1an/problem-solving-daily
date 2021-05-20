/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six;

import java.util.Scanner;
public class bitonic {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int in = s.nextInt();
        
        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();
    int i;
        for( i=0;arr[i]<arr[i+1] && i< n;i++){
        System.out.print(arr[i]+" ");
        }
        int j=i;
        if(j<n)
        for( j=i;arr[j]>arr[j+1] && j<n;j++){
            System.out.print(arr[i]+" ");
        }
        if(j==n+1)
            System.out.print("bitonic");
        
        
        
    }
    
}
