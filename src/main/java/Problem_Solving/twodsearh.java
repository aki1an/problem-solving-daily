package Problem_Solving;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Akilan
 */
public class twodsearh {
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       int index =0;
       double n = (str.length());
       int dim =  (int) Math.ceil(Math.sqrt(n));

       char arr[][] = new char[dim][dim];
     
       
       for(int i=0;i<dim;i++)
           for(int j=0;j<dim;j++){
               if(index<str.length()){
               arr[i][j]=str.charAt(index);
               index++;
               }
               
           }
       System.out.print("given array : \n");
        for(int i=0;i<dim;i++){
           for(int j=0;j<dim;j++)
               System.out.print(arr[i][j]+" ");
        System.out.println();
        }
        String key = s.next();
         for(int i=0;i<dim;i++){
           for(int j=0;j<dim;j++){
            if(arr[i][j]==key.charAt(0)){
                if(j+key.length()<dim){
                    String temp = "";  
                    for(int sp = j;sp<j+key.length();sp++){
                      temp+=arr[i][sp];
                      }
                   
                        System.out.print(temp);
                }
               }
            }
           }
        
    }
}
