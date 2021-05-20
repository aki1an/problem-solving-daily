/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem_Solving;
/*
Qn: 86th 
  Find the union of the two given arrays:
  
Input  : 
  Enter size of first array   :  6
  Enter the elements          :  1 2 3 4 5 3
  Enter size of second array  :  4
  Enter the elements          :  1 2 7 5

  OUTPUT                      :  1 2 3 4 5 7
*/
import java.util.Scanner;
public class Qn__86th__Union {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[100];
        
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        
        int m = s.nextInt();
        
        int arr2[] = new int[m];
        
        for (int i = 0; i < m; i++) {
            arr2[i] = s.nextInt();
        }
        
        int co = 0,k = 0;
        int[] temp = new int[100];
        
        //removing duplicates of array 1 arr1:
        
        for (int i = 0; i < n; i++) {    
            for (int j = 0; j < i; j++) {   
                if (i != j && arr[i] != arr[j]) {
                    co++;
                }
            }       
            if (co == i) // if no match found cpy; 
                temp[k++] = arr[i];
            co = 0;
        }
        arr = temp;
        n = k;
        int count = 0;
        
        // union :

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr2[i]!=arr[j]){
                    count++;
                }
            }
            if(count==n){
                arr[n]=arr2[i];
                n++;              
            }
            count=0;
        }
 
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
