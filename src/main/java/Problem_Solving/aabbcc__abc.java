package Problem_Solving;

import java.util.Scanner;

public class aabbcc__abc {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String qn = s.nextLine();
        String ans = "";
        
        for(int i=0;i<qn.length()-1;i++)
            if(qn.charAt(i)!=qn.charAt(i+1))
                ans+=qn.charAt(i);
        ans+=(qn.charAt(qn.length()-1));
        System.out.print(ans);
        
        
    }
}
