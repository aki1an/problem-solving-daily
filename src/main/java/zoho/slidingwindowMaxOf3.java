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
public class slidingwindowMaxOf3 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int arr[] = new int[n], ans[] = new int[n], it = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
int k = s.nextInt();int max = 0;
        
        for (int i = 0; i < n; i++) {
          
           if(i+k<n)
            for (int j = i; j < i+k; j++) {
                System.out.print(".");
                max = max < arr[j] ? arr[j] : max;
            }
            
            System.out.println();
            ans[it] = max;
            it++;
            max = 0;
        }
        for (int i = 0; i < it; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
