class Solution {
    public int kthSmallest(int[][] matrix, int k)
    {
        PriorityQueue<int[]> minHeap=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<Math.min(k,matrix.length);i++)
        {
            minHeap.add(new int[]{matrix[i][0], i, 0});
        }
        int a=1;
        while(!minHeap.isEmpty())
        {
            int[] ele=minHeap.poll();
            int element=ele[0];
            int listId=ele[1];
            int elementId=ele[2];

            if(a==k)
            return element;

            a++;
            int nextElementId=elementId+1;
            if(nextElementId<matrix[listId].length)
            minHeap.add(new int[]{matrix[listId][nextElementId],listId,nextElementId});
        }
        return 0;
    }
}
