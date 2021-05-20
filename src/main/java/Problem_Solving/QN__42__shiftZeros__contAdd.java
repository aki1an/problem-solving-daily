package Problem_Solving;
/**
 * @author : akilan 


 * QN:42. Given an array of integers of size n.
  Convert the array in such a way that if next valid number is same as current number,
  double its value and replace the next number with 0.
  After the modification, rearrange the array such that all 0’s are shifted to the end.

    Input : arr[] = {2, 2, 0, 4, 0, 8}
    Output : 4 4 8 0 0 0
   
    Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
    Output : 4 2 12 8 0 0 0 0 0 0
   
*/
import java.util.Scanner;
public class QN__42__shiftZeros__contAdd {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();
        
        for(int i=0;i<n-1;i++)
            if(arr[i]==arr[i+1]){
                arr[i]=arr[i]*2;
                arr[i+1]=0;
            }
         int start = 0,end =arr.length-1;
         
         for(int i=0;i<n;i++)
             System.out.print(arr[i]+" .");
         
         while(start<=end){
            
             if(arr[start]!=0)
                 start++;
             if(arr[end]==0)
                 end--;
             
             if(arr[start]==0&&arr[end]!=0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = arr[temp];
                start++;
                end--;
             }
           
            
         }
         
         for(int i=0;i<n;i++){
             System.out.print(" ...  "+arr[i]+" ");
         }
        
    }
    
}
