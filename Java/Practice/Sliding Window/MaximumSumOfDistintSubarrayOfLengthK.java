class Solution {
    public long maximumSubarraySum(int[] nums, int k)
    {
        int dups=0;
        long max=0, sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<k;i++)
        {
            if(!map.containsKey(nums[i]))
                map.put(nums[i],0);
            
            map.put(nums[i],map.get(nums[i])+1);
            sum=sum+nums[i];
            if(map.get(nums[i])>1)
                dups++;
        }

        if(dups==0)
            max=Math.max(sum,max);
        for(int i=k;i<nums.length;i++)
        {
            int numToAdd=nums[i];
            int numToRemove=nums[i-k];

            if(!map.containsKey(nums[i]))
                map.put(nums[i],0);
            map.put(numToAdd,map.get(numToAdd)+1);
            if(map.get(numToAdd)>1)
                dups++;
            sum=sum+numToAdd;

            if(map.get(numToRemove)>1)
            {
                dups=dups-1;
            }
            map.put(numToRemove,map.get(numToRemove)-1);
            sum=sum-numToRemove;
            
            if(dups==0)
            max=Math.max(sum,max);
        }
        return max;
        
    }
}
