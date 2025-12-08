class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int c=0, maxC=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            c++;
            else
            c=0;
            maxC=Math.max(c,maxC);
        }
        return maxC;
        
    }
}
