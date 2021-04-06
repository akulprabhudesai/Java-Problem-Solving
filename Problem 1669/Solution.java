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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count = 1;
        ListNode n = new ListNode();
        n.next = list1;
        
        while(count < a){
            list1 = list1.next;
            count++;
        }
       
       ListNode start = list1;
        
        while(count <= b){
            count++;
            list1 = list1.next;
        }
        list1 = list1.next;
        ListNode end = list1;
        
        start.next = list2;
        while(start.next!= null){
            start = start.next;
        }
        
        if(end != null){
            start.next = end;
        }

        return n.next;
    }
}