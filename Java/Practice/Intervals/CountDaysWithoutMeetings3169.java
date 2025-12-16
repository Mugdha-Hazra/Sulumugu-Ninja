class Solution {
    public int countDays(int days, int[][] meetings)
    {
        Arrays.sort(meetings, (a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> res=new ArrayList<>();
        res.add(meetings[0]);
        for(int i=1;i<meetings.length;i++)
        {
            int[] last=res.get(res.size()-1);
            int[] curr=meetings[i];

            // 1 3
            // 2 4
            if(curr[0]<=last[1])
            {
                last[0]=Math.min(last[0],curr[0]);
                last[1]=Math.max(last[1],curr[1]);
                res.set(res.size()-1,last);
            }
            else
            res.add(curr);
        }    
        int gap=0;
        for(int i=1;i<res.size();i++)
        {
            gap+=res.get(i)[0]-res.get(i-1)[1]-1;
        }
        gap+=res.get(0)[0]-1;
        gap+=days-res.get(res.size()-1)[1];
        return gap;
    }
}
