class Solution {
    public boolean canJump(int[] nums) 
    {
        int maxD=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>maxD)
                return false;
            maxD=Math.max(maxD,i+nums[i]);
        }
        return true;
    }
}
