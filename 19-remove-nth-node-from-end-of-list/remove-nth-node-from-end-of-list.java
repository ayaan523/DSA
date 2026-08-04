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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode DummyNode=new ListNode(0);
        DummyNode.next=head;
        ListNode fast=DummyNode;
        ListNode slow=DummyNode;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
           
        }
         if(fast==null){
            slow.next=slow.next.next;
            }
            return DummyNode.next;
    }
}