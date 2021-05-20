package Problem_Solving;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akilan
 */
import java.util.Scanner;
public class qn89thWindows {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int w = s.nextInt();
        int max = 0;
        for(int i=0;i<n-w+1;i++){
            for(int j=i;j<i+w;j++){
                max = arr[j]>max?arr[j]:max;
            }
            System.out.print(max);
            max = 0;
        }
    }
}
