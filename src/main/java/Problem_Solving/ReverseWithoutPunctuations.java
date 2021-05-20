package Problem_Solving;

import java.util.Scanner;

public class ReverseWithoutPunctuations {
   
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char arr[] = str.toCharArray();
        
        int start = 0,end = str.length()-1;
        String ans = "";
      
        while(start<end){
            
            char x = arr[start];
            char y = arr[end];
            
            if(!(Character.isAlphabetic(x)||Character.isDigit(x))) start++;
                
            if(!(Character.isAlphabetic(y)||Character.isDigit(y))) end--;
                
            if((Character.isAlphabetic(y)||Character.isDigit(y))
                    &&
               (Character.isAlphabetic(x)||Character.isDigit(x))){
                
               
                char temp = arr[start] ;
               x = y;
               y = temp;
               System.out.println(x+"  "+y);
               start++;
               end--;
               
            }
           
        }
          System.out.println(""+String.valueOf(arr));
    }
}
