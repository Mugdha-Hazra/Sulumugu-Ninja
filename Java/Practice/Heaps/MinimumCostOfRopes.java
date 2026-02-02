class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arr)
        {
            pq.add(i);
        }
        int cost=0;
        while(pq.size()>1)
        {
            int min1=pq.poll();
            int min2=pq.poll();
            cost+=min1+min2;
            pq.add(min1+min2);
        }
        return cost;
    }
}
