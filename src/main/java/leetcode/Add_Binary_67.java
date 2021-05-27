package leetcode;

import java.util.Scanner;

/**
 * 67. Add Binary
 * Easy
 *
 * 2821
 *
 * 354
 *
 * Add to List
 *
 * Share
 * Given two binary strings a and b, return their sum as a binary string.
 *
 *
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 *
 * Constraints:
 *
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 * */
public class Add_Binary_67 {

    public String addBinary(String num1, String num2) {

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

            if (add > 1) carry = 1;
            else carry = 0;
            ans.append(add % 2);
            l1--;
            l2--;

        }
        if (carry == 1) ans.append(1);


        return new String(ans.reverse());
    }

    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        System.out.print(new Add_Binary_67().addBinary(a,b));
    }

}
