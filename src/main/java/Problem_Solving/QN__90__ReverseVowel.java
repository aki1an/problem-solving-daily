package Problem_Solving;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akilan
 */
import java.util.Scanner;
import java.util.Stack;
public class QN__90__ReverseVowel {
   public static boolean isVowel(char st){
        if(st=='A'||st=='E'||st=='I'||st=='O'||st=='U')
            return true;
        if(st=='a'||st=='e'||st=='i'||st=='u'||st=='u')
            return true;
        
        return false;
    }
   
   static void usingStack(String str){
       String ans="";
       Stack<Character> stk = new Stack();
       for(int i=0;i<str.length();i++)
           if(isVowel(str.charAt(i)))
               stk.push(str.charAt(i));
       
       for(int i=0;i<str.length();i++){
           if(isVowel(str.charAt(i)))
               ans+=stk.pop();
           else
               ans+=str.charAt(i);
       }
       System.out.println("stk : "+ans);
       
   } 
    
    
    
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        String input = s.nextLine();
        char arr[] = input.toCharArray();
        int st = 0,end =input.length()-1;
        usingStack(input);
        while(st<end){
            
            if(!isVowel(arr[st]))
                st++;
            
            if(!isVowel(arr[end]))
                end--;
            if(isVowel(arr[st])&&(isVowel(arr[end])))
            {
                char temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }
        System.out.println("nor : "+String.valueOf(arr));
    }
}
