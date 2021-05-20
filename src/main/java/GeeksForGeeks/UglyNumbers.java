package GeeksForGeeks;

import java.util.Scanner;

public class UglyNumbers {
    static boolean isUgly(int n){
        int count = 0;
        System.out.print("\n"+n+" ");
        for(int i=2;i<=n;i++) {
            if (n % i == 0) {
                count++;
                System.out.print("  * "+i);
                if (i != 2 && i != 3 && i != 5)
                    return false;
            }

        }
        System.out.println();
        if(count==1)
            return false;
        else
             return true;

    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n+1];
        int count = 0;
        int k = 0;
        int start = 1;
        for(int i=0;i<n;i++){
             if(isUgly(start)){
                 arr[k++]=start;
             }
             start++;
             if(k>arr.length)
                 break;
        }
System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
