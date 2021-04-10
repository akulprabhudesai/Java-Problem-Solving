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
        Stack<Integer> first = new Stack<>();
        Stack<Integer> sec = new Stack<>();
        
        while(l1 != null){
            first.push(l1.val);
            l1 = l1.next;
        }
        
        while(l2 != null){
            sec.push(l2.val);
            l2 = l2.next;
        }
        
        int sum = 0;
        ListNode val = new ListNode();
        int c = 0;
        while(!first.isEmpty() || !sec.isEmpty()){
            
            if(!first.isEmpty()) sum += first.pop();
            if(!sec.isEmpty()) sum += sec.pop();
            val.val = (sum % 10);
            ListNode h = new ListNode(sum / 10);
            h.next = val;
            sum = sum / 10;
            val = h;
            
        }
        if(val.val == 0)return val.next;
        return val;

    }
}