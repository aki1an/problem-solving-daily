/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six;
import java.util.Scanner;

public class MobilePlan {
   
    static void printDetails(int mor,int eve,int nit){
        
        float plan1 = (float) (mor>100? (mor-100)*25 + eve*15+20*nit : eve*15+20*nit)/100;
        float plan2 = (float) (mor>250? (mor-250)*45 + eve*35+25*nit : eve*35+25*nit)/100;
        System.out.println("plan A costs "+plan1);
        System.out.println("plan B costs "+plan2);
        System.out.print(plan1>plan2?"Plan B is cheapest":"plan A is cheapest");
        
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int mor =s.nextInt();
        int eve = s.nextInt();
        int nit = s.nextInt();
        printDetails(mor, eve, nit);
    }
}
