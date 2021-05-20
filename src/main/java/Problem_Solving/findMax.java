package Problem_Solving;


import java.util.Scanner;

public class findMax{

    
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int []arr = new int [n];
       
       for(int i=0;i<n;i++) arr[i]=s.nextInt();
      
       int max = arr[n-1];
       int temp;
        arr[n-1] = -1;
       for(int i = n-2;i>=0;i--){
           temp = arr[i];
           arr[i]=max;
           if(temp>max) {
              
               max = temp; 
           }
           System.out.println(" max : "+max+"  temp: "+temp);

       }
       for(int i=0;i<n;i++)
           System.out.print(arr[i]);
       
    }
}