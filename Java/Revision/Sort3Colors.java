class Solution {
    public void swap(int[] arr, int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] nums)
    {
        int i=0, k=0, j=nums.length-1;
        while(k<=j)
        {
            if(nums[k]==1)
            k++;
            else if(nums[k]==2)
            {
                swap(nums,j,k);
                j--;
            }
            else
            {
                swap(nums,k,i);
                i++;
                k++;
            }
        }
    }
}
