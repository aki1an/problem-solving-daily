package leetcode;

import java.util.Scanner;

public class Length_of_lastword_58 {


    public int lengthOfLastWord(String s) {
        int count  = 0;
        s = s.trim();
        for(int i=s.length()-1;i>=0;i--){

            if(s.charAt(i)==' ')
                break;
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.print(new Length_of_lastword_58().lengthOfLastWord(str));
    }
}
