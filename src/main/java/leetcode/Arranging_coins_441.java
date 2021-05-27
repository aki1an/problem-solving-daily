package leetcode;

import java.util.Scanner;

public class Arranging_coins_441 {

    public int arrangeCoins(int n) {
        int ans = 0;
        long sum = 0;
        for(int i=1;i<=n;i++) {
            sum += i;
            if(sum>n) return i-1;
            if(sum==n) return i;
        }

        return ans;
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(new Arranging_coins_441().arrangeCoins(n));
    }
}
