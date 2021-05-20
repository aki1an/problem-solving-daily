package Problem_Solving;


import java.util.Scanner;
public class qn8thPrintwithDuplication {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int count =0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]!=arr[j])
                    continue;
                else
                    count=-1;
            }
            System.out.print(count!=-1?arr[i]+" ":"");
            count=0;

        }
        
        
        
        
    }
}
