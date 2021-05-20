package Problem_Solving;
/**
 * Problem 37.:
Evaluate the expression and sort and print the output. Getting the input is the tricky part

* @Input:
   Number of input : 4
   2*3
   2^2^2
   35
   3*1
* @Output:
    3*1
    2*3
    2^2^2
    35

*/
//not completed
import java.util.Scanner;
import java.util.Stack;

public class QN__37___evaluate_expression {
    
    static boolean closing(char ch){
        if(ch==')'||ch==']'||ch=='}')
            return true;
        return false;
    }
    static boolean isOperator(char ch){
        if(ch=='+'||ch=='-'||ch=='^'||ch=='*')
           return true;
        return false;
    }
    
    static void evaluate(String exp){
        Stack<Character> stk = new Stack();
        Stack<Integer> istk = new Stack();
        String inte="";
        
        for(int i=0;i<exp.length();i++){
            
            if(Character.isDigit(exp.charAt(i)))
            {
                while(Character.isDigit(exp.charAt(i))){
                    inte+=exp.charAt(i);
                    i++;
                }
            }
            istk.push(Integer.parseInt(inte));
            
            
        }
        System.out.print(istk);
        
            
            
        }
     
    
    
    public static void main(String args[]){
     
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        String arr[] = new String[n];
        
        for(int i=0;i<n;i++){
           arr[i] = s.next();
            
        }
        evaluate("2-2*2");
        
        
        
        
    }
}
