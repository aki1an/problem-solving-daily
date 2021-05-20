/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem_Solving;
import java.util.Scanner;
/**
 *
 * @author Akilan
 */
public class QN__94__check_sum_present {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = s.nextInt();
        int n = s.nextInt();
        int start =0,end = N-1;
        while(start<end){
           System.out.println(arr[start]+" "+arr[end]);
            if(arr[start]+arr[end]<n)
                start++;
            if(arr[start]+arr[end]>n)
                end--;
        
            if(arr[start]+arr[end]==n)
            {
                System.out.println(arr[start]+" - "+arr[end]);
                System.out.print(true);
                return;
            }
        }
        System.out.print(false);
    }
}
