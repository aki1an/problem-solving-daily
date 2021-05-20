/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem_Solving;

/**
 *
 * @author Akilan
 
 * ON no :82
 
 * Find the second maximum element of array:
   input  : 1 2 4 6 8 
   output : 6
 
   input  : 1
   output :no second max
   * 
 */
import java.util.Scanner;
public class Qn__82th__2ndMax {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int start = 0,end = n-1;
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        
        while(start<end){
            if(arr[start]>max){
                max = arr[start];
            }
            if(arr[end]>max){
                max = arr[end];
            }
            if(arr[start]>max2 && arr[start]<max){
                max2 = arr[start];
            }
            if(arr[end]>max2 && arr[end]<max){
                max2 = arr[end];
            }
            start++;
            end--;
        }
        if(max2 == Integer.MIN_VALUE)
            System.out.print("no max2 element ");
        else
            System.out.println("second max element : "+max2);
    }
}
