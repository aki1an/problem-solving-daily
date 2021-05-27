package leetcode;

import java.util.Scanner;
//Qn:https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class LinkedListToBinary_1290 {
    public int getDecimalValue(ListNode head) {
        int arr[] = new int[31];
        int i = 0;int binary = 0;
        while(head!=null){
            arr[i++] = head.val;
            head = head.next;
        }
        for(int j=0;j<=i;j++){
            binary += arr[j]*(1<<(i-j-1));
        }
        return binary;
    }
}