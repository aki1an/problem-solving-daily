package Problem_Solving;

import java.util.HashMap;
import java.util.Scanner;
public class Qn__76th__PrintFib_Series {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt(),max = 0,st=0,en=n-1,a =0,b=1,c=0;
        int arr[]= new int[n];        
        HashMap <Integer,Integer>  hm= new HashMap<>();
        
        for(int i=0;i<n;i++) arr[i]=s.nextInt();

        while(st<=en){
           if(arr[st]>max) max=arr[st];
           if(arr[en]>max) max =arr[en];
           st++;
           en--;
        }

        for(int i=0;c<=max;i++){
          c=a+b;
          a=b;
          b=c;
          hm.put(c,c); 
        }
        
        for(int i=0;i<n;i++)
            if(hm.containsKey(arr[i]))
                System.out.print(arr[i]+" ");
 
    }
}
