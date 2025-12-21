class Solution {
    public void swap(int[] a, int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void sortColors(int[] nums)
    {
        int i=0, k=0, j=nums.length-1;
        while(k<=j)
        {
            if(nums[k]==1)
            {
                k++;
            }
            else if(nums[k]==2)
            {
                swap(nums,k,j);
                j--;
            }
            else
            {
                swap(nums,i,k);
                k++;
                i++;
            }
        }
    }
}
