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

            if(curr[0]<=last[1])
            {
                last[0]=Math.min(last[0],curr[0]);
                last[1]=Math.max(last[1],curr[1]);
                res.set(res.size()-1,last);            
            }
            else
            res.add(curr);
        }
        int gaps=0;
        for(int i=1;i<res.size();i++)
        {
            gaps+=res.get(i)[0]-res.get(i-1)[1]-1;
        }
        gaps+=res.get(0)[0]-1;
        gaps+=days-res.get(res.size()-1)[1];
        return gaps;
        
    }
}
