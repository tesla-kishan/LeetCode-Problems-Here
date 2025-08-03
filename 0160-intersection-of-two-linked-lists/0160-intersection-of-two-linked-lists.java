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
        Set<ListNode> here = new HashSet<>();
        while(headA != null){
            here.add(headA);
            headA=headA.next;
        }
        while(headB != null){
            if(here.contains(headB)) return headB;
            headB=headB.next;
        }
        return null;
    }
}