/*
delete n nodes after m nodes
The input list will have at least one element
Node is defined as
  class Node
  {
      int data;
      Node next;
      Node(int data)
      {
          this.data = data;
          this.next = null;
      }
  }
*/

class Solution {
    static void linkdelete(Node head, int n, int m)
    {
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            int counter=0;
            while(counter<m && curr!=null)
            {
                prev=curr;
                curr=curr.next;
                counter++;
            }
            counter=0;
            while(counter<n && curr!=null)
            {
                curr=curr.next;
                counter++;
            }
            prev.next=curr;
        }
        // your code here
    }
}
