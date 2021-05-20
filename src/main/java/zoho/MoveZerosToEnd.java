
package zoho;
import java.util.Scanner;
public class MoveZerosToEnd {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] =  new int[n];
       
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
//        int start = 0;
//        int end = arr.length-1;
//        
//        while(start<end){
//            if(arr[start]!=0)
//                start++;
//            if(arr[end]==0)
//                end--;
//            if(arr[start]==0 && arr[end]!=0)
//            {
//                int temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
//                start++;
//                end--;
//            }  
//            
//        }
            int k = 0;
            for(int i=0;i<n;i++){
                if(arr[i]!=0)
                    arr[k++] = arr[i];
            }
            for(int i=0;i<n;i++){
               
                if(i>=k)
                    arr[i] = 0;
                 System.out.print(arr[i]+" ");
            }
            
            
       
    }
}
