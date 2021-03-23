
  Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    int val = 0;
    ListNode n;
    public ListNode reverseList(ListNode head) {
        if(head == null)return null;
        swap(head, 0);
        return head;
    }
    
    public void swap(ListNode head, int counter){
       
        if(head.next != null){
          if(counter == 0)n = head;  
         swap(head.next, counter+1);
            
        }
        
        if(head.next == null && counter > 0){
            if(counter % 2 == 1)val = counter/2;
            else val = (counter/2) - 1;
        }
        if(counter > val){
        int cur = n.val;
        n.val = head.val;
        head.val = cur;
        n = n.next;  
        }
       
        return;
    }
}