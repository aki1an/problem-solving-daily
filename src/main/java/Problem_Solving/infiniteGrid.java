package Problem_Solving;

import java.util.Scanner;
public class infiniteGrid {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        s.nextLine();
     
        String movements = s.nextLine();
        
        String moves[] = movements.split(" ");
        for(int i=0;i<moves.length;i++){
        if(moves[i].equals("U")){
          y++;  
                  
         }
         if(moves[i].equals("D")){
            y--;
                  
         }
          if(moves[i].equals("L")){
            x--;
                  
         }
           if(moves[i].equals("R")){
            x++;
                  
         }
        
        }
        System.out.print(x+"\t"+y);
        
    }
}
