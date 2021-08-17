class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode head = l3;
        int carry = 0;
        while(l1 != null && l2 != null) {
            int x = l1.val + l2.val + carry;
            l3.val = x%10;
            System.out.println("First " + l3.val);
            carry = x/10;
            l3.next = new ListNode();
            l1 = l1.next;
            l2 = l2.next;
            l3 = l3.next;
        }
        if(l1 != null){
            while(l1 != null){
                int x = l1.val;
                l3.val = (carry + x)%10;
                System.out.println("Second " + l3.val);
                carry = (carry + x)/10;
                l3.next = new ListNode();
                l1 = l1.next;
                l3 = l3.next; 
            }
        }
        if(l2 != null){
            while(l2 != null){
                int x = l2.val;
                l3.val = (carry + x)%10;
                System.out.println("Third " + l3.val);
                carry = (carry + x)/10;
                l3.next = new ListNode();
                l2 = l2.next;
                l3 = l3.next; 
                
            }
        }
        if(carry != 0){
            l3.val = carry;
        }
        ListNode curr = head.next;
        ListNode prev = head;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        if(curr.val == 0){
            prev.next = null;
        }
        
        return head;
    }
}
