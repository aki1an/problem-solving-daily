package Problem_Solving;
/**
 * @author Akilan
 * 
    QN:47. Given an input string and a dictionary of words, 
           find out if the input string can be segmented into a 
          space-separated sequence of dictionary words
          * Consider the following dictionary 
         
          * @INPUT:
          
            { i, like, sam, sung, samsung, mobile, ice, 
              cream, icecream, man, go, mango}

            Input:  ilike
            Output: Yes 
            The string can be segmented as "i like".

            Input:  ilikesamsung
            Output: Yes
            The string can be segmented as "i like samsung" 
            or "i like sam sung".<>

*/

import java.util.HashMap;
import java.util.Scanner;
public class QN__47__Dictionary_words {
   
    
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        
        String input = s.nextLine();
        str = str.replace("{", "");
        System.out.print(input);
        str = str.replace("}","");
        str = str.replaceAll(" ", "");
        String arr[] = str.split(",");
        
        HashMap<String,String> hm = new HashMap();
        for (String arr1 : arr)             
            hm.put(arr1, arr1);  
        
        int coun = 0, start =0;
        for(int i=0;i<input.length();i++){
            
            String sub = input.substring(start,i+1);
            System.out.print(sub+"..\n");
            if(hm.containsKey(sub)){
                coun+=sub.length();
                start = i+1;
                
            }
            
        }
        
        if(coun == input.length())
            System.out.println("yes");
        else 
            System.out.println("No");

    }
}
