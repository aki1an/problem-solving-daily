package Problem_Solving;


import java.util.*;

class balancing {

    static boolean isbalanced(String str) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if ((x == '{' || x == '[' || x == '(')) {
                stk.push(x);
            }
            if (stk.isEmpty()) {
                return false;
            }
            //{{[()]}}
            if (x == '}') {
                char chk = stk.pop();
                if (chk == '[' || chk == '(') {
                    return false;
                }

            } else if (x == ']') {
                char chk = stk.pop();
                if (chk == '{' || chk == '(') {
                    return false;
                }

            } else if (x == ')') {
                char chk = stk.pop();
                if (chk == '{' || chk == '[') {
                    return false;
                }
             }
        }
        return stk.isEmpty();
    }
    
    
    //x pattern of given string
   
static void pritnx(String str){
int n = str.length();
    for(int i=0;i<n;i++){
    int last = n-i-1;
    for(int j=0;j<n;j++){
        if(j==i||j==last)
            System.out.print(str.charAt(j));
        else
            System.out.print(" ");
    }
    System.out.println();
    }
    
    
}
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
       System.out.print( isbalanced(str));
        
    }
}
