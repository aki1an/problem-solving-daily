package Problem_Solving;

import java.util.Scanner;
import java.util.Stack;
public class stringBal {
    
    static boolean isbalanced(String str){
         int n = str.length();
        char temp;boolean ans = true;
        Stack<Character> stk = new Stack();
        for(int i=0;i<n;i++){
            char x =str.charAt(i);
            if(x=='{'||x=='['||x=='('){
                stk.push(x);
                
            }
           
            if(stk.isEmpty())
            {
                return false;
            }
            
            switch(x){
                case '}':{
                     temp = stk.pop();
                    
                     if(temp=='('||temp =='[')                     
                         return false;
                     break;
                         
                }
                case ']':
                     temp = stk.pop();
                    
                     if(temp=='('||temp =='{')
                         return false;
                     break;
                    
                    case ')':
                     
                        temp = stk.pop();
                    
                        if(temp=='{'||temp =='[')
                            return false;
                        break;
                    
            } 
        }
        
        return stk.isEmpty();
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
    
        String str  =s.nextLine();
       System.out.print(isbalanced(str));
    }
}
