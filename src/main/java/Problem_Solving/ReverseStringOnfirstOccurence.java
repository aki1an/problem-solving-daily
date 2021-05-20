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

public class ReverseStringOnfirstOccurence {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
        String s1 = s.nextLine();int n1 = s1.length();int pos =0;
        String s2 = s.nextLine();int n2 = s2.length();
        String arr[] = s1.split(" ");
        int stin = arr.length;
        
        for(int i=0;i<arr.length;i++){
              if(arr[i].contains(s2)){
                  stin = i;
              }
        }
        
        for(int i=0;i<stin;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=arr.length-1;i>=stin;i--){
            System.out.print(arr[i]+" ");
        }
        
      
    }
}
