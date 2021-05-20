/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem_Solving;

/**
 *
 * @author Akilan
 */
import java.util.Scanner;
public class QN__57___Days_between_dates {
    static boolean isLeapYear(int year){
        if(year%4==0&& (year%400==0 || year%100!=0)){
            return true;
        }
        return false;
    }
    
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int d1 = s.nextInt(), m1 = s.nextInt(), y1 = s.nextInt();
        int d2 = s.nextInt(), m2 = s.nextInt(), y2 = s.nextInt();
        int days1 = 0,days2 = 0;
        
        
        
        System.out.print(isLeapYear(2000));
        
    }
}
