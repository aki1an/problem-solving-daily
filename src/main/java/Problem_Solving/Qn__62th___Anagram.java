package Problem_Solving;


import java.util.Scanner;

public class Qn__62th___Anagram {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String ar[] = str.split(",");
        System.out.println("word : ");
        String word = s.nextLine();
        int wl = word.length();
        boolean wr[] = new boolean[255];
        boolean isAna = true;

        for (int i = 0; i < 255; i++) {
            wr[i] = false;
        }

        for (int i = 0; i < wl; i++) {
            wr[word.charAt(i)] = true;
        }

        System.out.print("Anagram words : ");
        for (String cont : ar) {
            if (cont.length() == wl) {
                for (int j = 0; j < wl; j++) {
                    if (wr[cont.charAt(j)] == false) {
                        isAna = false;
                        break;
                    }
                }
                System.out.print(isAna ? cont + "\n" : "");
                isAna = true;
            }
        }

    }
}
