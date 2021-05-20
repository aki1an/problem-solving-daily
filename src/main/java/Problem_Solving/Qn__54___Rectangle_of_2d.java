package Problem_Solving;

import java.util.Scanner;
public class Qn__54___Rectangle_of_2d {
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            arr[i][j] = s.nextInt();
           }
        }
        int x1=s.nextInt();
        int y1=s.nextInt();
        int x2=s.nextInt();
        int y2=s.nextInt();
        int sum = 0;
        for(int i=x1;i<=x2;i++){
            for(int j=y1;j<=y2;j++){
                sum+=arr[i][j];
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("sum : "+sum);
    }
}
