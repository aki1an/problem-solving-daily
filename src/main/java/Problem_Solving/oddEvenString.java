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
public class oddEvenString {
    public static void main(String args[]){
        Scanner s= new Scanner (System.in);
        String input = s.nextLine();
        String odd ="",even="";
        for(int i=0;i<input.length();i++){
            if(i%2==0)
                even+=input.charAt(i);
            else
                odd+=input.charAt(i);
        }
        System.out.print(even+" "+odd);
    }
}
