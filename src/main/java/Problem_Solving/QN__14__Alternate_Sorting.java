package Problem_Solving;
/**
 *
 * @author Akilan
 * Sample Input – Alternate Sorting 

   Input: {1, 2, 3, 4, 5, 6, 7}
   output: {7, 1, 6, 2, 5, 3, 4}
   
   last first last-1 fist-1...last-n fist-n
   * 
 */
import java.util.Scanner;

public class QN__14__Alternate_Sorting {
    
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int arr[] = new int[n];
       int ans[] = new int[n];
       
       for(int i=0;i<arr.length;i++)
           arr[i] = s.nextInt();
       
       //start points to 1st and end -lst;
       int start=0, end=n-1;
       
       boolean b =false;
       //for alternation true ? fist:lst elemnt to ans; 
       for(int i=0;i<n;i++){
           if(b){
           ans[i]=arr[start];
           start++;
           b=!b;
           }
           else{
               ans[i]=arr[end];
               end--;
               b=!b;
           }
       }
       for(int i=0;i<n;i++)
           System.out.print(ans[i]+" ");
       
       
     } 
}
