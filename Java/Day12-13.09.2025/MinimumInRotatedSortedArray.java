class Solution {
    public int findMin(int[] nums) 
    {
        if(nums[0]<=nums[nums.length-1])
        return nums[0];

        int m=0,l=0, h=nums.length-1, min=nums[0];
        while(l<h)
        {
            m=(l+h)/2;
            min=Math.min(min,Math.min(nums[l],nums[h]));
            if(nums[m]>nums[h])
            l=m+1;
            else
            h=m;
        }
        return min;
        
    }
}
