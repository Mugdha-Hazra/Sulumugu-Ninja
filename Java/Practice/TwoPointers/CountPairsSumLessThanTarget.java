class Solution {
    public int countPairs(List<Integer> nums, int target) 
    {
        int count=0, i=0, j=nums.size()-1;
        Collections.sort(nums);
        while(i<=j)
        {
            if((nums.get(i)+nums.get(j))< (target))
            {
                count+=j-i;
                i++;
            }
            else
            j--;
        }
        return count;
    }
}
