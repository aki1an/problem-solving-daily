/*
 *@author akilan

71. Find the extra element and its index
Input : [ 10, 20, 30, 12, 5 ]
    [ 10, 5, 30, 20 ]
Output : 12 is the extra element in array 1 at index 4

Input : [ -1, 0, 3, 2 ]
    [ 3, 4, 0, -1, 2 ]
Output : 4 is the extra element in array 3 at index 5

 */
package Problem_Solving;
import java.util.*;
public class QN__71__Extra_element {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        HashMap<Integer,Integer> hm = new HashMap();
        
        for(int i=0;i<n;i++ ){
            arr[i] = s.nextInt();
            hm.put(arr[i],i+1);
        }
        
        int m =s.nextInt();
        for(int i=0;i<m;i++){
            int val = s.nextInt();
            if(hm.containsKey(val)){
                hm.remove(val);
            }
            else{
                System.out.println(val+" extra element is present int array 2 at index "+i);
            }
        }
        if(!hm.isEmpty()){
           for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
              System.out.print(entry.getKey()+" is the extra element is present in array 1 at index"+entry.getValue());
           }
        }
        s.close();
    }
}
