package leetcode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 415. Add Strings
 * <p>
 * Add to List
 * <p>
 * Share
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
 * <p>
 * You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: num1 = "11", num2 = "123"
 * Output: "134"
 * Example 2:
 * <p>
 * Input: num1 = "456", num2 = "77"
 * Output: "533"
 * Example 3:
 * <p>
 * Input: num1 = "0", num2 = "0"
 * Output: "0"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= num1.length, num2.length <= 104
 * num1 and num2 consist of only digits.
 * num1 and num2 don't have any leading zeros except for the zero itself.
 */


public class Add_Strings_415 {

    public String addStrings(String num1, String num2) {

        int carry = 0;
        StringBuffer ans = new StringBuffer();
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        while (true) {


            int add = 0;
            if (l1 < 0 && l2 >= 0) {
                add = carry + num2.charAt(l2) - 48;
            }
            else if (l2 < 0 && l1 >= 0) {
                add = num1.charAt(l1) - 48 + carry;
            }
            else if (l1 >= 0 && l2 >= 0)
                add = num1.charAt(l1) - 48 + carry + num2.charAt(l2) - 48;

            else break;

            if (add > 9) carry = 1;
            else carry = 0;
            ans.append(add % 10);
            l1--;
            l2--;

        }
        if (carry == 1) ans.append(1);


        return new String(ans.reverse());
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String n1 = s.next();
        String n2 = s.next();
        System.out.println(new Add_Strings_415().addStrings(n1, n2));
    }
}
