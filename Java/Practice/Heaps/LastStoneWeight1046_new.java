class Solution {
    public int lastStoneWeight(int[] stones)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones)
        {
            pq.add(stone);
        }
        while(pq.size()>1)
        {
            int last=pq.poll();
            int last2=pq.poll();
            if(last>last2)
            pq.add(last-last2);
        }
        return pq.size()==0 ? 0:pq.peek(); 
    }
}
