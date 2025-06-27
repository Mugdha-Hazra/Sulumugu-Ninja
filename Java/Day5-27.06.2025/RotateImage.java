class Solution {
   
    public void reverse(int[] arr)
    {
        for(int i=0, j=arr.length-1;i<j;i++,j--)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public void rotate(int[][] m) 
    {
        for(int i=0;i<m.length;i++)
        {
            for(int j=i+1;j<m[i].length;j++)
            {
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }

        for(int i=0;i<m.length;i++)
        {
            reverse(m[i]);
        }
        
    }
}
