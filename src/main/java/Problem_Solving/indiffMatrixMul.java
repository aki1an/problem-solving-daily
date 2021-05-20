package Problem_Solving;

import java.util.Scanner;

public class indiffMatrixMul {
    
    public static void AdditionofNumbers_byArrays(){
       Scanner s= new Scanner(System.in);
        int n1=s.nextInt(),k=0,ans=0,dig=0;
        int a[]=new int[n1];
        
        for(int i=0;i<n1;i++){
            a[i]=s.nextInt();
        }
        
        while(n1>0){
            int a1[]=new int [a[k]];
            
            for(int i=0;i<a[k];i++){
                a1[i]=s.nextInt();
            }
            
            for(int j=0;j<a1.length;j++){
                
                dig=10*dig+a1[j];
            }
            
            ans=ans+dig;
            dig=0;
            n1--;
            k++;
        }
        System.out.println("Output : "+ans);
    }
    
    
    
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
      
        int n = s.nextInt();
        int a[] = new int[n];
  
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
       int dig =0,ans=0;
        for(int i=0;i<a.length;i++){
             int aw[]=new int[a[i]];
            for(int f=0;f<a[i];f++){
                aw[f] =s.nextInt();
            }int it =0;
            while(a[i]-->0){
                dig = dig*10+aw[it];
                it++;
            }
            ans+=dig;
            dig = 0;
            
        }
        
        System.out.print(ans);
    }
}
