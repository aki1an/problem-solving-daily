/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem_Solving;

import java.util.Scanner;
public class binarySearch {
    static int binarySearch(int arr[],int key,int left,int right){
       
        int mid = arr.length/2;
        if(arr[mid]==key)
            return mid;
        else{
        if(mid<key){
            right = mid;
            return binarySearch(arr, key, left, right);
        }
        else if(mid>=key){
            left = mid;
            return binarySearch(arr, key, left, right);
        }
        else
        return -1;
    }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++) arr[i]=s.nextInt();
        
        System.out.print(binarySearch(arr, 5, 0, n));
        
        
    }
}
