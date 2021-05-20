/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem_Solving;

import java.util.Scanner;

public class Qn__72th__LeastPrimeToBeAdded {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), i, j, count = 0, k = 0;
        int a1[] = new int[n];
        int a2[] = new int[n];
        for (i = 0; i < n; i++) {
            a1[i] = s.nextInt();
        }
        for (i = 0; i < n; i++) {
            a2[i] = s.nextInt();
        }
        
        for (i = 2; i < 1000; i++) {
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            
            if (count == 2) {
                if (a1[k] % a2[k] == 0) {
                    System.out.println("-1");
                    k++;
                    if (k >= n) {
                        break;
                    }
                } else if ((a1[k] + i) % a2[k] == 0) {
                    System.out.println("Add " + i);
                    k++;
                    if (k >= n) {
                        break;
                    }
                }
            }
            count = 0;
        }
    }

}

 class Z72 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int primeNos[] = new int[168];
        int n = s.nextInt(), temp = 0;
        int nos[] = new int[n];
        int dividend[] = new int[n];
        int count = 0;
        int k = 0, m = 0;
        System.out.println("Enter elements");

        for (int j = 0; j < n; j++) {
            nos[j] = s.nextInt();
        }
        System.out.println("Enter dividing elements");

        for (int j = 0; j < n; j++) {
            dividend[j] = s.nextInt();
        }

        // for prime nos
        for (int i = 2; i < 1000; i++) {
            count = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = 0;
                }

            }
            if (count == 1) {
                primeNos[k] = i;
                k++;

            }

        }
        int flag = 0;
        System.out.print("Nos are:");
        for (int i = 0; i < n; i++) {
            temp = nos[i];
            while ((temp % dividend[i]) != 0) {

                int temp1 = temp + primeNos[m];

                if ((temp1 % dividend[i]) == 0) {
                    break;
                }
                m++;
            }

            //  System.out.println("d" + dividend[i]);
            if (temp % dividend[i] == 0) {
                System.out.print(-1);

            } else {
                System.out.print(" " + primeNos[m] + " ");
            }

        }

    }

}