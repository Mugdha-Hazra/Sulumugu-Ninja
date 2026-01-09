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
    static void linkdelete(Node head, int n, int m) {
        // your code here
        Node curr=head;
        while(curr!=null)
        {
            Node prev=null;
            int counter=0;
            while(counter<m && curr!=null)
            {
                counter++;
                prev=curr;
                curr=curr.next;
            }
            counter=0;
            while(counter<n && curr!=null)
            {
                counter++;
                curr=curr.next;
            }
            prev.next=curr;
        }
    }
}
