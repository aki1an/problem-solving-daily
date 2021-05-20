
package six;

import java.util.Scanner;
public class daysbetweenDate {
    
    static boolean leap(int year){
        if(year%4==0 && (year%100!=0 || year %400==0))
            return true;
        return false;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int d1=s.nextInt(),m1= s.nextInt(),y1 = s.nextInt();
        int d2 = s.nextInt(),m2 = s.nextInt(),y3 = s.nextInt();
        System.out.print(leap(y1));
    }
}
