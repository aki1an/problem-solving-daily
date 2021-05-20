package Problem_Solving;

import java.util.Scanner;
public class QN__63__midNumber__SumL_R_Equals {
    static int sum(int ar[],int s,int e){
        int sum=0;
        for(int i=s;i<e;i++){
            sum+=ar[i];
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i!=0&&i!=n-1){
                int sumP = sum(arr, 0, i);
                int sumN = sum(arr,i+1,arr.length);
                if(sumP==sumN)
                {
                    System.out.print("mid element : "+arr[i]);
                    break;
                }
                
            }
        }       
    }
}
