package Problem_Solving;

import java.util.HashMap;
import java.util.Scanner;


public class firstOccurenceOfallCharactersInSecondString {
    
    static int[] findRange(String first, String last){
        int res [] = new int[2];
        HashMap <Character,Integer> hm = new HashMap<>();
   
        for(int i=0;i<first.length();i++){
            if(hm.containsKey(first.charAt(i)))
                continue;
            else
                hm.put(first.charAt(i), i);
        }
        
        System.out.print(hm);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<last.length();i++){
            
           if(min>hm.get(last.charAt(i)))
               min = hm.get(last.charAt(i));
           if(max<hm.get(last.charAt(i)))
               max = hm.get(last.charAt(i));
        }
        
        res[0]=min;
        res[1]=max;
        System.out.print(max+">>"+min);
        
        return res;
    }
    
    static int[] findRange(String first,String last,int love){
        
        int res[]  = new int[2];
        int pos[] = new int[255];
               for(int i=0;i<pos.length;i++)
                   pos[i]=-1;
        for(int i=0;i<first.length();i++){
         if(pos[first.charAt(i)]==-1)
            pos[first.charAt(i)] = i;
        }
        
        for(int i=0;i<pos.length;i++)
            System.out.println(i+" "+(char)i+" "+pos[i]);
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<last.length();i++){
          if(min>pos[last.charAt(i)])
              min = pos[last.charAt(i)];
          if(max<pos[last.charAt(i)])
              max = pos[last.charAt(i)];
          
        }
        res[0]=min;
        res[1]=max;
        
        return res;
    }
    
    
    
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String first = s.nextLine();
        String second = s.nextLine();
        int ans[] = findRange(first,second,9);
        for(int i=ans[0];i<=ans[1];i++){
            System.out.print(first.charAt(i));
        }
    }
}
