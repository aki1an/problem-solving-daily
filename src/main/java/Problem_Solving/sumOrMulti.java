package Problem_Solving;


import java.util.Scanner;

public class sumOrMulti {
        
    static int[] mulsum(int n){
            int ans[] = {0,1};
           int rem = 0;
          
            while(n!=0){
                rem = n%10;
                n = n/10;
                ans[0]+=rem;
                ans[1]*=rem;
            }
            
            return ans;
    }
    
    
    public static void main(String args[]){
                
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int ans[] = new int[n];
      for(int i=0;i<arr.length;i++)
          arr[i]=s.nextInt();
        for(int i=0;i<arr.length;i++){
            int mul = mulsum(arr[i])[0];
            int tot = mulsum(arr[i])[1];
            if(mul > tot) ans[i] = mul;
            else ans[i] = tot;
        }
        for(int i=0;i<ans.length;i++)
        System.out.print(ans[i]+" ");
    }
}

