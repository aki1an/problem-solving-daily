package leetcode;

import java.util.Scanner;

public class ConsistentStrings_1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        //total characters possible
        char bucket[] = new char[255];
        int count = 0, ans = 0;

        //marking characters present in "allowed":
        for (int i = 0; i < allowed.length(); i++)
            bucket[allowed.charAt(i)] = 'p';

        //every word in words array
        for (String word : words) {

            //each word
            for (int j = 0; j < word.length(); j++) {

                //checking if present
                if (bucket[word.charAt(j)] == 'p')
                    count++;
            }
            //count == wordlength
            if (count == word.length())
                ans++;
            count = 0;
            //re-initialization to zero

        }
        return ans;


    }
    public static void main(String args[]){
            Scanner s = new Scanner(System.in);
            System.out.println("allowed : ");
            String allowed = s.next();
            System.out.println("words");
            String sent = s.nextLine();
            String[]  words = sent.split(" ");
            System.out.print(new ConsistentStrings_1684().countConsistentStrings(allowed,words));
    }
}