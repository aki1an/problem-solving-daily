package Problem_Solving;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
public class Remove {    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine(),str1 = str.toLowerCase();
        String ans="";
        char arr[] = str.toCharArray();
        HashMap <Character,Character> hm = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(hm.containsKey(str.charAt(i))){
                char ch = str.charAt(i);
                char lp = ' ';
                char up = ' ';
                while(hm.containsKey(ch)||hm.containsKey(lp)||hm.containsKey(up)){
                    
                    if(ch=='9'||ch=='z'||ch=='Z'){
                    if(ch=='9') ch='0';
                    if(ch=='z') ch='a';
                    if(ch=='Z') ch='A';
                    
                    }
                    else
                    ch++;
                    
                     if(!(hm.containsKey(ch)||hm.containsKey(lp)||hm.containsKey(up)))
                         break;
                }
                ans+=ch;
                hm.put(ch, ch);
                System.out.print(ch);
            }
            else{
                ans+=arr[i];
                System.out.print(arr[i]);
                hm.put(arr[i],arr[i]);    
         
            }
        }
      
        for(int i=0;i<str.length();i++){
            if(String.valueOf(ans.charAt(i)).equalsIgnoreCase(String.valueOf(str.charAt(i))))
                System.out.print(str.charAt(i)+"*");
            else
                System.out.print(ans.charAt(i));
        }
        System.out.print(hm);
         
    }
}
