/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:

    struct comparator{

        bool operator()(ListNode* a, ListNode* b)
        {
            return a->val>b->val;
        }

    };

    ListNode* mergeKLists(vector<ListNode*>& lists) 
    {  // creation of Priority queue
        priority_queue<ListNode*,vector<ListNode*>,comparator>pq;
        //insertion of all the heads in pq
        for(ListNode*head:lists)
        {
            if(head)
            pq.push(head);
        }
        //dummy node creation
        ListNode dummy(0);
        ListNode *tail=&dummy; //tail pointer for stiching
        //merging process
        while(!pq.empty())
        {
            ListNode* smallest=pq.top();
            pq.pop();
            tail->next=smallest;
            tail=tail->next;
            if(smallest->next)
            pq.push(smallest->next);

        }

        return dummy.next;
        
    }
};
