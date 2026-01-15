class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());

        for(int stone:stones)
        maxHeap.add(stone);

        while(maxHeap.size()>1)
        {
            int last=maxHeap.remove();
            int secondLast=maxHeap.remove();

            if(last>secondLast)
            maxHeap.add(last-secondLast);
        }
        if(maxHeap.size()==1)
        return maxHeap.peek();

        return 0;
        
    }
}
