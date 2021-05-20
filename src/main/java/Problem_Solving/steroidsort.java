/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem_Solving;

import java.util.Scanner;

public class steroidsort {
public static int a = 0,b=0;
   String r = "a".toLowerCase();
    
    static int slidingSort(int arr[], int n, int k) {
        if (n == 0) {
            return -1;
        }

        int left = 0,
                right = n,
                midl = (left + right) / 2,
                midr = (left + right) / 2;
        if (arr[left] == k) {
            return left;
        }
        if (arr[right] == k) {
            return right;
        }
        if (arr[midl] == k) {
            return midl;
        }

        while (left < midl || midr < right) {
            if (arr[left] == k) {
                return left;
            }
            if (arr[right] == k) {
                return right;
            }
            if (arr[midl] == k) {
                return midl;
            }
            if (arr[midr] == k) {
                return midr;
            }

            left++;
            right--;
            midl--;
            midr++;
            System.out.println(" steroid "+a++);
        }
        
        return -1;
        
    }
     static void normal(int arr[],int n,int k){
        for(int i=0;i<n;i++){
            if(arr[i]==k) 
                System.out.print(i);
        System.out.println("normal : "+b++);
        }
        System.out.println("finished");
    }

    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        System.out.print("enter the no of elements");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
   
        System.out.print("\nelement to be searched\n");
        int key = s.nextInt();
        double sb = System.currentTimeMillis();
        int ans = slidingSort(arr, n-1,key);
        double sa = System.currentTimeMillis();
        double runtimes = sa-sb;
        System.out.println("element found at position "+(ans+1)+" and at index "+ans);
        
        System.out.println("runtime stroid : "+runtimes);
        double sds = System.currentTimeMillis();
        normal(arr, n, key);
         double sda = System.currentTimeMillis();
         double runimes = sda-sds;
         System.out.println("run time normal : "+runimes);

    }
}
