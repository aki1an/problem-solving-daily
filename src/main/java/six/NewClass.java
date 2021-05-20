/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six;

import java.util.Scanner;
public class NewClass {
    public static void main(String args[]) {
         int n, i, t = 0, sum = 0, maxelement = 0;
         int a[] = new int[100];
         Scanner s = new Scanner(System.in);
         System.out.println("Enter n");
         n = s.nextInt();
         System.out.println("Enter array values");

         for (i = 0; i < n; i++) {
             a[i] = s.nextInt();
         }

         for (i = 0; i < n; i++) {
             sum = 0;
             t = a[n - 1];
             for (int j = n - 1; j >= 1; j--)
                 a[j] = a[j - 1];

             a[0] = t;

             for (int k = 0; k < n; k++)
             {
                 sum += (k * a[k]);
                 System.out.println(a[k]+" * "+k+" = "+a[k]*k);
             }
             if (sum > maxelement)
                 maxelement = sum;

         }
         System.out.println("Maximum element is :" + maxelement);
     }
    
}
