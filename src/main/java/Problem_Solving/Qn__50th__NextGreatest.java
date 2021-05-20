package Problem_Solving;

import java.util.Scanner;
public class Qn__50th__NextGreatest {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=s.nextInt();
        int frq[] = new int[n];
        int count = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j&&arr[i]==arr[j]){
                    count++;
                }
            }
            frq[i]=count;
            count=1;
        }
        
        for(int i=0;i<n;i++)
            System.out.println("arr["+i+"] : "+arr[i]+" : "+frq[i]);
        
        int max1=0,max2=0,max3=0;
   
        for(int i=0;i<n;i++){
            if(max1<frq[i])
                max1=frq[i];
            
            if(max2<frq[i]&&frq[i]<max1)
                max2=frq[i];
            if(max3<frq[i]&&frq[i]<max2)
                max3=frq[i];
            
            System.out.println(max1+" "+max2+" "+max3);
        }
        boolean f1=false,f2=false,f3=false;
        for(int i=0;i<n;i++){
            if(frq[i]==max1&&f1==false)
            {
                System.out.println(arr[i]);
                f1=true;
            }
            if(frq[i]==max2&&f2==false){
                System.out.println(arr[i]);
                f2=true;
            }
            if(frq[i]==max3&&f3==false){
                System.out.println(arr[i]);
                f3=true;
            }
            }
        
    }
}
