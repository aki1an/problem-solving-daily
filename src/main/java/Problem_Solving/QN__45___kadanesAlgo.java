package Problem_Solving;

import java.util.Scanner;
public class QN__45___kadanesAlgo {
    /*
    Kadanes Algo:
        find the maximum sub arraySum 
    sum += add element one by one
    
    if sum<0 reinitialize to 0;
    
    to find largest contigous sub array : 
    
    */
    
    
    
    public static void main(String args[]){
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     int arr[] = new int[n];
     
     for(int i=0;i<n;i++){
         arr[i] = s.nextInt();
     }
     int sum =0;
     int max =arr[0];
     for(int i=0;i<n;i++){
         sum+=arr[i];
         max = max<sum?sum:max;
         if(sum<0)
             sum=0;
     }
     System.out.print(max);
        
    }
}
