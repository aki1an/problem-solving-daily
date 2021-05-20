
package Problem_Solving;
import java.util.Scanner;
/**
 *
 * @author Akilan
 * date : 
 */
/*

79. Insert 0 after consecutive (K times) of 1 is found
Example:
Input:
Number of bits: 12
Bits: 1 0 1 1 0 1 1 0 1 1 1 1
Consecutive K: 2

Output:
1 0 1 1 0 0 1 1 0 0 1 1 0 1 1 0

*/
public class Qn__79th__Insert_zero_consecutive_1s {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = s.nextInt();
        int arr[] = new int[n*2+2];
        System.out.println("enter elements :");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("enter k ");
        int k = s.nextInt();
        int count =0;
       
        
        
        
        for(int i=0;i<n;i++)
        {
          if(arr[i]==1)
              count++;
          if(arr[i]==0)
              count=0;
          if(count==k){
              n++;
              for(int sb=n-2;sb>=i+1;sb--)                 
                  arr[sb+1]=arr[sb];
                   
              
              arr[i+1]=0;
              count =0;
          }
            
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
