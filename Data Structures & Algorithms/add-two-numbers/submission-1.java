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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head= new ListNode(0,null);
        ListNode sum= head;
        int carry=0;
        while(l1 !=null && l2 != null){
            
            int sumVal= l1.val + l2.val + carry;
            if(carry > 0) carry=0;

            if(sumVal > 9){
                carry = 1;
                sumVal = sumVal%10;
            } 
            ListNode addition = new ListNode(sumVal,null);
            sum.next = addition;
            sum=sum.next; l1=l1.next; l2=l2.next;
        }
        while(l1!=null){
            int sumVal= l1.val + carry;
            if(carry > 0) carry=0;
            if(sumVal > 9){
                carry = 1;
                sumVal = sumVal%10;
            } 
            ListNode addition = new ListNode(sumVal,null);
            sum.next = addition;
            sum=sum.next; l1=l1.next;;
        } while(l2!=null){
            int sumVal= l2.val + carry;
            if(carry > 0) carry=0;
            if(sumVal > 9){
                carry = 1;
                sumVal = sumVal%10;
            } 
            ListNode addition = new ListNode(sumVal,null);
            sum.next = addition;
            sum=sum.next; l2=l2.next;;
        }
        if(carry > 0){
        ListNode addition = new ListNode(carry,null);
        sum.next = addition;
        sum=sum.next;
        }
return head.next;

    }
}
