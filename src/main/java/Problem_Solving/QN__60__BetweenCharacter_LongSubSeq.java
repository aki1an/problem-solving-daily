package Problem_Solving;

import java.util.ArrayList;
import java.util.Scanner;
public class QN__60__BetweenCharacter_LongSubSeq {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        char arr[] = str.toCharArray();
        
        ArrayList<Integer> al = new ArrayList();
        
        for(int i=0;i<str.length();i++) {
            for(int j=str.length()-1;j>=0;j--){
                if(i!=j && arr[i]==arr[j]){
                    System.out.println("("+i+","+j+") : "+(j-i-1));
                    al.add(j-i-1);
                  
                }
            }
        }
        int max =Integer.MIN_VALUE;
        int st=0,end=al.size()-1;
        while(st<=end){
            max=max<al.get(st)?al.get(st):max;
            max=max<al.get(end)?al.get(end):max;
            st++;
            end--;
        }
        max = max==Integer.MIN_VALUE?-1:max;
        System.out.println("max : "+max);
        
            
        
    }
}
