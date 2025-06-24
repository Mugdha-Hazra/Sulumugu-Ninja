class Solution {
    public List<List<Integer>> threeSum(int[] a) 
    {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            int t=-a[i], l=i+1, r=a.length-1;

            if(i>0 && a[i]==a[i-1])
                continue;

            while(l<r)
            {
                int s= a[l]+a[r];
                if(s==t)
                {
                    list.add(Arrays.asList(-t,a[l],a[r]));
                    while(l<r && a[l]==a[l+1])l++;
                    while(l<r && a[r]==a[r-1])r--;
                    l++;
                    r--;
                }
                else if(s<t)
                l++;
                else
                r--;
            } 

        }
        return list;

        
    }
}
