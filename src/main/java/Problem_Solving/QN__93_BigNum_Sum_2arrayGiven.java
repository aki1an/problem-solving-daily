package Problem_Solving;

import java.util.ArrayList;

import java.util.Scanner;
public class QN__93_BigNum_Sum_2arrayGiven {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n1 = s.nextInt();
        int n1arr[] = new int[n1];
        for(int i=0;i<n1;i++)
            n1arr[i] = s.nextInt();
        int n2 = s.nextInt();
        int n2arr[] = new int[n2];
        
        for(int j=0;j<n2;j++)
            n2arr[j]=s.nextInt();
       
        int n = n1>n2?n1:n2;
        
        int c1=n1-1,c2=n2-1;int carry = 0;
        ArrayList al = new ArrayList();
        int typ1=0,typ2=0;
        
        // n = largest of both arrylength
        
        for(int i=0;i<n;i++){
         int temp=0,num=0;
         
         /*
         typ1 is 1st number arry digit 
         typ2 is 2nd number arry digit
         
         if no of dig in arr1 < n set typ 1 =0 and
         vise versa 
         else 
         
         
         */
            if(c1<n1&&c2<n2&&c1>=0&&c2>=0){
             typ1=n1arr[c1];
             typ2=n2arr[c2];
            }
            else{
                if(c1<0&&c2>=0){
                    typ1=0;
                    typ2=n2arr[c2];
                    
                }
                else if(c2<0&&c1>=0)
                {
                    typ2=0;
                    typ1=n1arr[c1];
                    
                }
                else if(c2<0&&c1<0)
                {
                    typ1=0;
                    typ2=0;
                }
            }
                
                temp = typ1+typ2+carry;
               
                
                
                al.add(temp%10);
                if(temp<=9)
                    carry =0;
                else
                    carry =1;
            
            
            c1--;
            c2--;
            
        }
        for(int i=al.size()-1;i>=0;i--)
        System.out.print(al.get(i));
    }
}
