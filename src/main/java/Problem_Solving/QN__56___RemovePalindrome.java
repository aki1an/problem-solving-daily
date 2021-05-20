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
public class QN__56___RemovePalindrome {
    static boolean isPalindrome(String str){
        
        int start = 0,end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)) return false;
            start++;
            end--;
        }
        
        return true;
    }
    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str = s.nextLine();
        String words[] = str.split(" ");

        
        for (String word : words) {
            if (!isPalindrome(word)) {
                System.out.print(word+" ");
            }
        }
        
    }
}
