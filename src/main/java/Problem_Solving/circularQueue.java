package Problem_Solving;

import java.util.Scanner;
public class circularQueue {
    static int[] remove(int a[],int k){
       int arr[] = new int[a.length-1];
       int j=0;
       for(int i=0;i<arr.length;i++){
         if(a[i]!=k){
             arr[j]=a[i];
             j++;
         }
        
       }
       
       return arr;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int process[] = new int[n];
       
        
        for(int i=0;i<n;i++){
            process[i] = s.nextInt();
        }
        int start = s.nextInt()-1;
        int skip = s.nextInt()-1;
        
        
        int count = process.length;
        for(int i=start;count>1;i = (i+skip)%n)
        {
            System.out.println();
            System.out.print(" *"+process[(i+skip)%n]+" \n");
           
            process = remove(process,process[(i+skip)%n]);
            count --;
            
        }
        
        for(int i=0;i<process.length;i++)
        System.out.print(process[i]+" ");
        
    }
}