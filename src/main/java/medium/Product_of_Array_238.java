package leetcode;

import java.util.Scanner;

public class Product_of_Array_238 {

    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int flag = 0;
        int breas = 1;
        int zero = 0, ind = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) zero++;

            if (zero == 1 && breas == 1) {
                ind = i;
                flag = 1;
                breas = 0;
                continue;
            }
            if (zero > 1) {
                ind = -1;
                flag = 0;
                return new int[nums.length];
            }
            mul *= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (flag == 1) {
                if (i != ind && i != -1)
                    nums[i] = 0;
                else
                    nums[i] = mul;
            } else
                nums[i] = mul / nums[i];

        }
        return nums;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        System.out.println(new Sum_of_All_Odd_Length_sub_array.Product_of_Array_238().productExceptSelf(arr));
    }

}
