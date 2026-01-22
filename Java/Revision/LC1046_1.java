class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones)
        {
            maxHeap.add(stone);
        }
        while(maxHeap.size()>1)
        {
            int last=maxHeap.poll();
            int second_last=maxHeap.poll();
            if(last>second_last)
            maxHeap.add(last-second_last);
        }
        return maxHeap.size()==0 ? 0:maxHeap.peek();
    }
}
