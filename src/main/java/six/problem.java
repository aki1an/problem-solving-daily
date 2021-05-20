package six;

import java.util.Scanner;

public class problem {
    
    static int sumOfDigs(int num) {
        int ans = 0;
        
            int rem = num % 9;
            if (rem != 0)
                System.out.println(rem);
            for (int i = 0; i < num / 9;)
                System.out.print("9");
            
        return ans;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        sumOfDigs(n);
        s.close();
    }
}
