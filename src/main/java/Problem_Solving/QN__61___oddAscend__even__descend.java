package Problem_Solving;
/**
 * @author : akilan
 * 
63.array of numbers were given to find a number which has same sum of numbers 
in it’s either side.

I/p 1, 2, 3, 7, 6
O/p 7(has 1+ 2+3 in left 6 in right)

*/
import java.util.Arrays;
import java.util.Scanner;
public class QN__61___oddAscend__even__descend {
    public static void main(String args[]){
      Scanner s= new Scanner(System.in);
      int n = s.nextInt();
      int arr[]=new int[n];
      
      for(int i=0;i<n;i++)
          arr[i]=s.nextInt();
       int start =0,end = n-1;
       
       while(start<end){
         if(arr[start]%2!=0)
             start++;
         if(arr[end]%2==0)
             end--;
         if(arr[start]%2==0&&arr[end]%2!=0){
             int tem = arr[start];
             arr[start]=arr[end];
             arr[end]=tem;
             start++;
             end--;
         }
       }
       int count =0;
       for(int i=0;i<n;i++){
           if(arr[i]%2!=0)
               count=i;
       }
       Arrays.sort(arr,0,count+1);
       Arrays.sort(arr,count+1,n);
       
       for(int i=0;i<count+1;i++){
           System.out.print(arr[i]+" ");
       }
       int k = 0;
       for(int i=n-1;i>count;i--)
       {
         System.out.print(arr[i]+" ");
       }
       
    }
}
