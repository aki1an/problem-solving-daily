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
public class version {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String version1 = s.next();
        String version2 = s.next();
        
        String ver1[] = version1.split(":");
        String ver2[] = version2.split(":");
        
        
            if(Integer.valueOf(ver1[0])>Integer.valueOf(ver2[0])){
                if(Integer.valueOf(ver1[1])>Integer.valueOf(ver2[2])){
                    if(Integer.valueOf(ver1[2])<Integer.valueOf(ver2[2])){
                        System.out.print("ver1 is upgraded");
                                
                    }
                    else System.out.print("ver2 is upgraded");
                        
                }
                else System.out.print("ver2 is upgraded");
            }
        else System.out.print("ver2 is upgraded");
        
        
    }
}
