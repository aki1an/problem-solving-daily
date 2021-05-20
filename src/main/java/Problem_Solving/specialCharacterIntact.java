package Problem_Solving;

import java.util.Scanner;

public class specialCharacterIntact {
    
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char arr[] = str.toCharArray();
        int start = 0,end = arr.length-1;
        
        while(start<end) {
            if((Character.isAlphabetic(arr[start]) || Character.isDigit(arr[start]))
                    &&
                   (Character.isAlphabetic(arr[end]) || Character.isDigit(arr[end]))){
               char temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               start++;
               end--;
            }
            if(!(Character.isAlphabetic(arr[start]) || Character.isDigit(arr[start])))
                    start++;
            if(!(Character.isAlphabetic(arr[end]) || Character.isDigit(arr[end])))
                    end--;
            
        }
        
        System.out.println(String.valueOf(arr));
        
    }
}
