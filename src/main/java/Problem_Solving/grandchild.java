package Problem_Solving;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;


public class grandchild {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int pair = s.nextInt();
        String arr[][] = new String [pair][2];
        
        for(int i=0;i<pair;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=s.next();
            }
        }
        
        String gprnt = s.next();
        //find the child
        ArrayList<String> child = new ArrayList<>(); 
        for(int i=0;i<pair;i++){
            if(arr[i][1].equals(gprnt)){
                child.add(arr[i][0]);
            }
        }
        //counting the child                
        int count = 0;
        for(int i=0;i<child.size();i++){
        for(int j=0;j<pair;j++){
            if(child.get(i).equals(arr[j][1]))
                count++;
          }    
        }
        
        System.out.println(count);
         
    }
    
}
