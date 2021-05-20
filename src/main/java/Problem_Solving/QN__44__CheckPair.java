package Problem_Solving;
/**
 *
 * @author Akilan

Sample Input – Alternate Sorting 

44.  Given an array A[] and a number x, check for pair in A[] with sum as x.
        Eg : Input {1, 2, 4, 3, 5, 6}
                   SUM : 5
                   
             Output : 2 (1, 4) & (2, 3)

   * 
 */     
import java.util.Scanner;
public class QN__44__CheckPair {
   public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int k = s.nextInt();
       int arr[] = new int[n];
      String str = "";
        for(int i=0;i<n;i++){
           arr[i] = s.nextInt();
       }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i!=j)
                if(arr[i]+arr[j]==k){
                   str += ("("+arr[i]+", "+arr[j]+") & ");
                count++;
                }
                
            }
        }
        System.out.print(count);
        System.out.print(str.substring(0,str.length()-1));
        
        
   }  
}
