package Problem_Solving;
/**@author : akilan

QN: 31 --> 
    1. Pangram Checking
    Check whether all english alphabets are present in the given sentence or not
    I/P: abc defGhi JklmnOP QRStuv wxyz
    O/P: True
    I/P: abc defGhi JklmnOP QRStuv
    O/P: False
    
*/
import java.util.Scanner;
public class QN__31__PangramCheck {
    public static void main(String args[]){       
        
        char ar[] = new Scanner(System.in).nextLine().toCharArray();
        char pos[] = new char[255];
        int n = ar.length;
        int count = 0;
        
        for(int i=0;i<n;i++)
        {   
            if(Character.isAlphabetic(ar[i]) && pos[ar[i]]!='p'){
            pos[Character.toLowerCase(ar[i])]='p';
            pos[Character.toUpperCase(ar[i])]='p';
            count++;
            }
        }
        
        System.out.println(" > " +count);
        
        if(count==26)
            System.out.print("contains all alphabets");
        else
            System.out.print("-1");
          
    }
}
