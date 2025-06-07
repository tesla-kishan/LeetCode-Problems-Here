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
        Node temp = head;
        while(temp != null){
            Node f = temp.next;
            if(temp.child != null){
                Node t = flatten(temp.child);
                temp.next = t;
                t.prev = temp;
            Node x = t;
            while(x.next != null){
                x = x.next;
            }
            x.next = f;
            if(f !=null) f.prev = x;
            }
            temp.child = null;   
            temp = temp.next;            
        }
        return head;
    }
}