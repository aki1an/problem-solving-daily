package Problem_Solving;


import java.util.Scanner;
public class Qn__55th___Shift_0_to_right {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();
         int strt = 0,end = n-1;
         
         while(strt<end){
             if(arr[strt]!=0)
                 strt++;
             if(arr[end]==0)
                 end--;
             if(arr[strt]==0&&arr[end]!=0)
             {
                 int temp =arr[strt];
                 arr[strt]=arr[end];
                 arr[end]=temp ;
                 strt++;
                 end--;
             }
         }
         for(int i=0;i<n;i++)
             System.out.print(arr[i]+" ");
    }
}
