class Solution {
    public int countDays(int days, int[][] meetings)
    {
        Arrays.sort(meetings, (a,b) -> Integer.compare(a[0],b[0]));
        int maxEnd=meetings[0][1];
        int i=1, gaps=0;
        while(i<meetings.length)
        {
            if(meetings[i][0]>maxEnd)
            {
                gaps+=meetings[i][0]-maxEnd-1;
            }
            maxEnd=Math.max(maxEnd,meetings[i][1]);
            i++;
        }
        gaps+=meetings[0][0]-1;
        gaps+=days-maxEnd;
        return gaps;
    }
}
