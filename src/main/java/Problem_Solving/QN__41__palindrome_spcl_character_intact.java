package Problem_Solving;
/**
 * @Author : akilan
 * 
@QN:41.Given a String with or without special characters find if it is Palindrome or Not.. No splitting of array must be done or No additional spaces must be used for storing the array..
    Eg: RACE CAR
    Eg: I DID, DID I ?

*/

import java.util.Scanner;

public class QN__41__palindrome_spcl_character_intact {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        char arr[] = str.toCharArray();
        int start = 0, end = arr.length - 1;
        int count = 0;
        int flag = 0;
        
        while (start < end) {
            if ((arr[start] >= 'a' && arr[start] <= 'z'
                    || arr[start] >= '0' && arr[start] <= '9'
                    || arr[start] >= 'A' && arr[start] <= 'Z')
                    && (arr[end]  >= 'a' && arr[end]   <= 'z'
                    || arr[end]   >= '0' && arr[end]   <= '9'
                    || arr[end]   >= 'A' && arr[end]   <= 'Z')) {
                if (arr[start] != arr[end]) {
                    flag = 1;
                    System.out.print("not pali");
                    break;
                }
                count++;
                start++;
                end--;

            }

            if (!(arr[start] >= 'a' && arr[start] <= 'z'
                    || arr[start] >= '0' && arr[start] <= '9'
                    || arr[start] >= 'A' && arr[start] <= 'Z')) {

                start++;
            }
            if (!(arr[end] >= 'a' && arr[end] <= 'z'
                    || arr[end] >= '0' && arr[end] <= '9'
                    || arr[end] >= 'A' && arr[end] <= 'Z')) {
                end--;
            }

        }
        System.out.println(flag == 0 ? "palindrome" : "");

    }
}
