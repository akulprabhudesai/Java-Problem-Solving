/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    
       ListNode a = headA;
       ListNode b = headB;
        
       while( a != null && b != null){
           if(a.next != b.next){
             //  System.out.println("not equal");
               a = a.next;
               b = b.next;
               if(a == null)a = headB;
               if(b == null)b = headA;
           }
            else if(a.next == null && b.next == null){
                if(a == b)return a;
                else return a.next;
            }
           else{
               if(a != b)return a.next;
               return a;
           } 
          
       }
        return new ListNode();
    }
}