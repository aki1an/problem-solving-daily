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

public class QN__21__SnakePattern {
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int val = 1;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                
                if (i % 2 == 0) {
                    System.out.print(val++);
                }
                if (i % 2 != 0) {
                    System.out.print(val--);
                }
                
            }
           /*
              to jump to opposite end val +n;
              since using val++ : -1
              ..ly using val-- : +1
           */
            if(i%2==0)val += n-1;
            else val+=n+1;
            System.out.println();
        }
    }
}
