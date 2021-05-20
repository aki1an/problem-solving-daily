/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoho;
import java.util.Scanner;
public class a3b1c3 {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        int n = str.length();char past=' ';
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if(Character.isAlphabetic(x))
                past = x;
            if(x>='0'&&x<='9'){
                int num = 0;
                String val = "";
                while(i<n&&Character.isDigit(str.charAt(i))){
                    val+=str.charAt(i);
                    i++;
                }
                i--;
                num = Integer.parseInt(val);
                while(num-->1){
                    System.out.print(past);
                }
                
            }
            else System.out.print(x);
            
            
        }
  
    }
}
