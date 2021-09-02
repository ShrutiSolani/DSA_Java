/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        else if(head.next.next == null){
            if(n == 1){
                head.next = null;    
            }
            else{
                head = head.next;               
            }
            return head;
        }
        else{
            ListNode curr = head, prev = head;
            int count = 0;
            while(curr != null){
                count++;
                curr = curr.next;
            }
            if(count == n){
                head = head.next;
                return head;
            }
            else{
                curr = head;
                for(int i = 1;i < count-n+1; i++){
                    prev = curr;
                    curr = curr.next;
                }
                prev.next = curr.next;
                return head;
            }       
        }    
    }
}
