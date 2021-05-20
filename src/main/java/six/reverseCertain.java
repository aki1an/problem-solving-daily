package six;
import java.util.Scanner;

public class reverseCertain {
    
    public static void main(String args[]) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int n2 =n;
        int r = s.nextInt();
        int ans=0 ; int after = 1;
        while (r-- > 0) {
            int dig = n % 10;
            n /= 10;
            after=10;
            ans = ans * 10 + dig;
        }
        System.out.print((n2/after)*after+ans);
        s.close();
    }
}