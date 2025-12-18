class Solution 
{
    public void threeSumHelper(int f, int[] nums, List<List<Integer>> res)
    {
        int i=f+1, j=nums.length-1;
        while(i<j)
        {
            if(nums[i]+nums[j]+nums[f]==0)
            {
                res.add(Arrays.asList(nums[f],nums[i],nums[j]));
                i++;
                j--;
                while(i<j && nums[i]==nums[i-1])
                i++;
                while(i<j && nums[j]==nums[j+1])
                j--;
            }
            else if(nums[i]+nums[j]+nums[f]>0)
            j--;
            else
            i++;
        }
    }
    public List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int f=0;f<nums.length;f++)
        {
            if(nums[f]>0)
            return res;

            if(f==0 || nums[f]!=nums[f-1])
            threeSumHelper(f, nums, res);
        }
        return res;
        
    }
}
