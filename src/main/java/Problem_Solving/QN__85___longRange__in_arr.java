/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem_Solving;
import java.util.Scanner;
/**
 *
 * @author Akilan
 * 85. Given an array of positive numbers. Print the numbers which have longest continuous range.
  Ex.  INPUT  :  

    Enter array size  :  8
    Enter arryay elements  :  1 3 10 7 9 2 4 6
    
    OUTPUT  :

    1 2 3 4

  Ex.  INPUT  :  

    Enter array size  :  8
    Enter arryay elements  :  1 3 9 7 8 2 4 6
    
    OUTPUT  :

    1 2 3 4
    6 7 8 9
 * 
 * 
 */
public class QN__85___longRange__in_arr {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
       String ans="";
        for(int i=0;i<n;i++){
             arr[i] =s.nextInt();
        }
        int count = 1;
        int start =0;
        int bst = 0;
        int amax = 0;
            for(int i=0;i<n;i++){
                if(amax<arr[i])
                    amax = arr[i];
            }
        System.out.println("amx: "+amax);
         int target = arr[0]+1;
        for(int i=0;i<n;i++){
            target = arr[i]+1;
           int tt = target;
            for(int j=0;j<n;j++){
                if(arr[j]==target){
                    count++;    
                    ans+=target;
                    target = target+1;
                    j=0;
                }
//                if(tt==target&&j==n-1){
//                 if(i+1<n)
//                    target=arr[i+1];
//                }
               
            }
            if(bst<count)
            { 
                bst = count;
                start = arr[i];
                
            }
           
            count = 1;
            if(target==amax)
                break;
            
        }
        System.out.println(start+" "+bst);
        for(int i=start;i<start+bst;i++)
            System.out.print(i+" ");
System.out.print(ans);
        
      
        

        
    }
}
