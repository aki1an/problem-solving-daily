package Problem_Solving;


import java.util.Scanner;

public class xletter {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        String str = s.next();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j)
                System.out.print(str.charAt(i));
                else if(i+j==n-1)
                    System.out.print(str.charAt(n-1-i));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}
