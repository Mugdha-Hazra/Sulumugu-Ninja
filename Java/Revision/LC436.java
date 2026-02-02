class Solution {
    public int[] findRightInterval(int[][] intervals)
    {
        PriorityQueue<int[]> minStart=new PriorityQueue<>((a,b)->a[0]-b[0]);
        PriorityQueue<int[]> minEnd=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int[] res=new int[intervals.length];
        for(int i=0;i<res.length;i++)
        {
            res[i]=-1;
            minStart.add(new int[]{intervals[i][0],i});
            minEnd.add(new int[]{intervals[i][1],i});
        }
        while(!minStart.isEmpty() && !minEnd.isEmpty())
        {
            int[] startEle=minStart.peek();
            int start=startEle[0];
            int startIdx=startEle[1];
            if(start>=minEnd.peek()[0])
            {
                res[minEnd.peek()[1]]=startIdx;
                minEnd.poll();
            }
            else
            minStart.poll();
        }
        return res;
    }
}
