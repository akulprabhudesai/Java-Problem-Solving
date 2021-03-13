/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node n = new Node();
        if(head == null)return null;
        n.next = head;
        
        ArrayList<Integer> v = new ArrayList<>();
     
        while(head != null){
            v.add(head.val);
            if(head.child != null){
                check(head.child, v);
            }
            head = head.next;
        }
       head = n.next;
        for(int i = 0; i < v.size();i++){
           if(i == 0) head.next = new Node(v.get(i), null, null, null);
            else  head.next = new Node(v.get(i), head, null, null);
            head = head.next;
        }
      return n.next.next;
    }
    
    public void check(Node h , ArrayList<Integer> v ){
       while(h != null){
          v.add(h.val);
          if(h.child != null){
              check(h.child,v);
          }
           h = h.next;
        }
    }
}