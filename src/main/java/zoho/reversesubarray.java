/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoho;
import java.util.Scanner;
/**
 *
 * @author Akilan
 */
public class reversesubarray {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        
        for(int i=0;i<n;i++){
            a[i]= s.nextInt();
        }
        int start = s.nextInt()-1;
        int end = s.nextInt()-1;
        
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end]=temp;
            start++;
            end--;
        }
        
   
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
        
        
    }
}
