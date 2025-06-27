class Solution {
    public int maxSubArray(int[] nums) 
    {
        int mx=nums[0], currSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currSum=Math.max(nums[i],currSum+nums[i]);
            mx=Math.max(mx,currSum);
        }
        return mx;
        
    }
}
