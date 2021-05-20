package Problem_Solving;

import java.util.*;
public class Qn__73___Descending {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
            if(hm.containsKey(arr[i])){
                hm.replace(arr[i], hm.get(arr[i])+1);
             
                cnt++;
            }
            else
                hm.put(arr[i],1);
            
        }
        System.out.print(hm);
        
        int el[] = new int[n],k=0,cn[] = new int[n];
        
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
           cn[k] = entry.getValue();
           el[k]=entry.getKey();
           k++;
        }
        
        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                if(cn[i]>=cn[j]){
                    int temp1=el[i];
                    int temp2=cn[i];
                    el[i]=el[j];
                    el[j]=temp1;
                    cn[i]=cn[j];
                    cn[j]=temp2;
                }
            }
        }
        
        for(int i=0;i<k;i++){
            System.out.println(el[i]+" "+cn[i]);
        }
        for(int i=0;i<k;i++){
            for(int j=0;j<cn[i];j++){
                System.out.print(el[i]+" ");
            }
        }
        

        
    }
}
