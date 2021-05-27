package leetcode;
/**
 * QN: http://leetcode.com/problems/sum-of-all-odd-length-subarrays/submissions/
 * youtube : https://www.youtube.com/watch?v=J5IIH35EBVE
 * */
import java.util.Scanner;

public class Sum_of_All_Odd_Length_sub_array {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i+j)%2==0){
                    if(i==j)
                        sum+=arr[j];
                    else{
                        for(int k=i;k<=j;k++)
                            sum+=arr[k];
                    }
                }
            }
        }
        return  sum;
    }

    static int best(int arr[]){
        //youtube : https://www.youtube.com/watch?v=J5IIH35EBVE
        int n = arr.length;
        int sum= 0,p;
        for(int i=0;i<n;i++){
            //finding occurrence
            /**
             *
             * ex : 1 3 2 5
             *
                 * 1
                 * 3
                 * 2
                 * 5
                 * 1 3 2
                 * 3 2 5
             *
             *
             * total occurrences
             *  start   end   indices start and end
             *    4      1    '1' will be the beginning 4 times and can end at one time ie: '1' itself
             *    3      2
             *    2      3
             *    1      4
             * ie:(n-i)  i+1
             */
            //p has both odd and even length subArray occurrence
            p=(n-i)*(i+1);
            //if odd then one p/2 does not give the occurrence
            if(p%2!=0) p+=1;

            sum+=p*arr[i]/2;

        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(new Sum_of_All_Odd_Length_sub_array().sumOddLengthSubarrays(arr));
        System.out.println(new Sum_of_All_Odd_Length_sub_array().best(arr));
    }

}
