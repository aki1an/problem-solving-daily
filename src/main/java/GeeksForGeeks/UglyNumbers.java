package GeeksForGeeks;

import java.util.HashMap;
import java.util.Scanner;

public class UglyNumbers {
    static boolean isUgly(int n){
        if(n==1) return true;
        if(n%2==0)
           return isUgly(n/2);
        else if(n%3==0)
           return isUgly(n/3);
        else if(n%5==0)
           return isUgly(n/5);
        else  return false;
    }

    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int start = 1,i=0;
        while (true){
            if(isUgly(start))
                arr[i++] =start;
            if(i==n) break;
            start++;
        }

        for(int h=0;h<n;h++)
            System.out.print(arr[h]+" ");
    }
}
