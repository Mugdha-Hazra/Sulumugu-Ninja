/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head)
    {
        // code here
     
        Node fast=head, slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast)
            break;
        }
        if(fast==null || fast.next==null)
        return 0;
        
        Node n1=slow.next;
        int len=1;
        while(n1!=slow)
        {
            n1=n1.next;
            len++;
        }
        return len;
        
    }
}
