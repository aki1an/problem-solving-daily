package Problem_Solving;


import java.util.Scanner;

public class QN__38___tower_build {



    public  static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = 6;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int tower1 = s.nextInt();
        int tower2 = s.nextInt();
        int sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5];
    }
}
