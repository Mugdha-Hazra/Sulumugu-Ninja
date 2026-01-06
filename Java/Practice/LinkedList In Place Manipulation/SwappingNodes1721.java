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
        ListNode n1=head, n2=head;
        int n=1;
        while(n<k)
        {
            n++;
            n1=n1.next;
        }
        ListNode n3=n1;
        while(n1.next!=null)
        {
            n1=n1.next;
            n2=n2.next;
        }    
        int temp=n3.val;
        n3.val=n2.val;
        n2.val=temp;
        return head;
    }
}
