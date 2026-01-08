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
    public ListNode swapNodes(ListNode head, int k)
    {
        int count=1;
        ListNode curr=head;
        while(count<k)
        {
            curr=curr.next;
            count++;
        }
        ListNode n2=curr, n1=head;
        while(curr.next!=null)
        {
            n1=n1.next;
            curr=curr.next;
        }
        int temp=n1.val;
        n1.val=n2.val;
        n2.val=temp;
        return head;
    }
}
