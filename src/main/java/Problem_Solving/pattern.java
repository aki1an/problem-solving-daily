package Problem_Solving;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

public class pattern {
    static Scanner s = new Scanner(System.in);
    
   static void leftTriangle(){
       int n = s.nextInt();
       
       for(int i=0;i<n;i++){
           for(int j=0;j<=i;j++){
              System.out.print("*");
           }
           System.out.println();
       }
    }
   
   static void leftNum (){
       int n = s.nextInt();
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print(j);
           }
           System.out.println();
       }
   }
   static void leftAlpha(){
       int n = s.nextInt();
       char A = 65;
       for(int i=0;i<n;i++){
           for(int j=0;j<=i;j++){
               System.out.print((char)(A+j)+" ");
           }
           System.out.println();
       }
   }
   static void invertedLeft(){
       int n = s.nextInt();
       
       for(int i=0;i<n; i++){
           for(int j=n;j>i;j--){
               System.out.print("*");
           }
           System.out.println();
       }
   }
    static void invertedLeftNum(){
       int n = s.nextInt();
       
       for(int i=0;i<n;i++){
           for(int j=n-1;j>=i;j--){
               System.out.print(n-j);
           }
           System.out.println();
       }
   }
    
   
   
    static void pyramid (){
        int n = s.nextInt();
        int ep = 0;
        for(int i=0;i<n;i++){
           
           for(int j=n;j>i;j--){
               System.out.print("   ");
           } 
           for(int ns=0;ns<i+1+ep;ns++){
               System.out.print(" * ");
               
           }
           ep = i+1;
           System.out.println();
           
        }
    }
    static void pyramidNum(){
        int n = s.nextInt();
        int in =0 ;
        for(int i=0;i<n;i++){
            for(int j = n;j>i;j--){
                System.out.print(" ");
            }
            int half = (i*2+1)/2+1;
            for(int k = 0;k<(i*2+1);k++){
               
                if(k<half){
                    in++;
                    System.out.print(in);
                    
                }
                else{
                     in--;
                    System.out.print(in);
                   
                }
            }
            System.out.println();
           
                 
        }
        
    }
    static void invertPyramid (){
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            for(int s=0;s<=i;s++){
                System.out.print(" ");
            }
            int ep =0;
            for(int j=(n-i)*2;j>=0;j--){
                System.out.print("*");
            }
             ep =i;
            System.out.println("");
        }
    }
    static void floyd(){
         var n = s.nextInt();
         int num = 1;
         for(int i = 0 ;i<=n;i++){
             for(int j=0;j<i;j++){
                 System.out.print(num+" ");
                 num++;
             }
             System.out.println();
         }
    }
    
    static void pascal(){
        var n = s.nextInt();
        int one =1 ;int v=2;
        for(int i=0;i<n;i++){
            for(int s=n-1-i;s>0;s--){
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
static void unknw(){
    int n = s.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
        for(int i=0;i<n;i++){
        for(int j=n;j>i;j++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
}
  public static void main(String args[]){
     Scanner s = new Scanner(System.in);
        unknw();
    }
}
