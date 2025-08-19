/*
  https://leetcode.com/problems/house-robber-ii/
*/
class Solution {

    public int rob1(int[] nums) 
    {
        int[] dp=new int[nums.length];
        dp[0]=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            int take=nums[i];
            if(i>1)
            take+=dp[i-2];

            int not_take=0+dp[i-1];

            dp[i]=Math.max(take,not_take);
        }
        return dp[nums.length-1];
    }
    public int rob(int[] nums) 
    {
        int n = nums.length;
        if (n == 1) return nums[0];

        int[] arr1=new int[nums.length-1];
        int[] arr2=new int[nums.length-1];
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0)
            arr1[i-1]=nums[i];
            if(i!=(nums.length-1))
            arr2[i]=nums[i];
        }
        return Math.max(rob1(arr1),rob1(arr2));
    }
}
