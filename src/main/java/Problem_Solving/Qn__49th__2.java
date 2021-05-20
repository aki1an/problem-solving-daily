package Problem_Solving;

import java.util.Scanner;
public class Qn__49th__2 {

    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        String mat = s.nextLine();
        char ar[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<mat.length();j++){
                if(str.charAt(i)==mat.charAt(j))
                   ar[i]= '~';
            }
            
        }
        String ans="";
        for(int i=0;i<ar.length;i++){
            if(ar[i]!='~')
                ans+=ar[i];
        }
        System.out.print(ans);
    }
}
