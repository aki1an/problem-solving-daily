package Problem_Solving;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoOfOccurences {
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if (hm.containsKey(arr[i])) {
                int present = hm.get(arr[i]);
                hm.replace(arr[i], present + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        System.out.println();

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
           System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
