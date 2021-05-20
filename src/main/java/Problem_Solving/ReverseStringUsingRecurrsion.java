package Problem_Solving;

import java.util.Scanner;



public class ReverseStringUsingRecurrsion {

    static String reverse(String str[],int n,String ans){
        
        if(n<0)  return ans;
        
        ans+=str[n]+" ";
        ans = reverse(str,n-1,ans);
        
        return ans;
    }
    
    public static void main(String args[]){
        
        Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        String arr[] = str.split(" ");

        System.out.print(reverse(arr,arr.length-1,""));
   
    }
}
