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
public class equilibriumIndex {
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        boolean b = true;
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            sum +=arr[i-1];
            if(sum==avl(arr,i+1)){
               System.out.print(i);
               b = !b;
               break;
            }
        }
        if(b)
        System.out.print(-1);
    
    }
    
    static int avl(int a[],int  k){
        int sum=0;
        for(int i=k;i<a.length;i++)
            sum += a[i];
            
        
        return sum;
    }
 
}
