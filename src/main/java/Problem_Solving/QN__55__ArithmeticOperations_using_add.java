package Problem_Solving;


import java.util.Scanner;

public class QN__55__ArithmeticOperations_using_add {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        System.out.println("addition:" + (a + b));
        System.out.println("subraction:" + (a + (-b)));

        //multiplication
        int v1 = a, v2 = b;
        boolean flag = false;
        if (v1 < 0) {
            v1 = -v1;
            flag = !flag;
        }
        if (v2 < 0) {
            v2 = -v2;
            flag = !flag;
        }
        int mul = 0;
        for (int i = 0; i < v2; i++) {
            mul += v1;
        }
        
        //division    
        int div=0;
        while(v1>=v2){
            v1-=v2;
            div++;
        }
        //signed / unsigned 
        if (flag) {
            mul = -mul;
            div=-div;
        }
        System.out.println("multiplication:" + mul);

       System.out.println("division:"+div );
    }
}
