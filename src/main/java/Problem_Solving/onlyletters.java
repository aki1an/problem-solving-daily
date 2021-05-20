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
public class onlyletters {
   public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       
       String sentence = s.nextLine();
       String ans = "";
       int n = sentence.length();
       for(int i=0;i<n;i++)
           if(sentence.charAt(i)>=65&&sentence.charAt(i)<=97+26||sentence.charAt(i)==' ')
              ans+=sentence.charAt(i);
         System.out.print(ans);
       
   } 
}
