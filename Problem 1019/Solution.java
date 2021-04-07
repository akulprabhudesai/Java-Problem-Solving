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
    public int[] nextLargerNodes(ListNode head) {
      Stack<Integer> st = new Stack<>();
      ArrayList<Integer> nums = new ArrayList<>();
        while(head != null){
            nums.add(head.val);
            head = head.next;
        }
        
        int[] res = new int[nums.size()];
        
        for(int i = 0; i < nums.size();i++){
            
            while(!st.isEmpty() && nums.get(st.peek()) < nums.get(i)){
                res[st.peek()] = nums.get(i);
                st.pop();
            }
            
            st.push(i);
        }
          
          return res;
    }
}