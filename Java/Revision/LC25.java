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
    public ListNode reverseKGroup(ListNode head, int k)
    {
        int len=0;
        ListNode curr=head;
        while(curr!=null)
        {
            len++;
            curr=curr.next;
        }
        int times=len/k;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        curr=head;
        ListNode p1=dummy;
        for(int i=0;i<times;i++)
        {
            int count=0;
            ListNode p2=curr, prev=null;
            while(count<k)
            {
                ListNode nxt=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nxt;
                count++;
            }
            // prev = head of reversed group
            // p2 = tail of reversed group
            // curr = first node after the group
            p1.next=prev; //connect previous part to reversed head
            p2.next=curr; //connect reversed tail to next group
            p1=p2;
        }
        return dummy.next;
    }
}
