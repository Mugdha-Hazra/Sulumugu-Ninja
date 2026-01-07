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
    public ListNode[] splitListToParts(ListNode head, int k) 
    {
        int len=0;
        ListNode curr=head;
        while(curr!=null)
        {
            len++;
            curr=curr.next;
        }   
        curr=head;
        int uniformNumber = len/k;
        int remainingNumber = len % k;

        ListNode[] res=new ListNode[k];
        for(int i=0;i<k;i++)
        {
            int count = uniformNumber;
            if(remainingNumber > 0)
            {
                count+=1;
                remainingNumber--;
            }

            ListNode prev=null, temp1=curr;
            int ctr=0;
            while(ctr<count)
            {
                prev=curr;
                curr=curr.next;
                ctr++;
            }
            if(prev!=null)
            prev.next=null;
            res[i]=temp1;

        }
        return res;
    }
}
