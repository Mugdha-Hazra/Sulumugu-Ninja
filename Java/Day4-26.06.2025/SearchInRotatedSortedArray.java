class Solution {
    public int search(int[] a, int t) 
    {
        int l=0, r=a.length-1, m=0;
        while(l<=r)
        {
            m=(l+r)/2;
            if(a[m]==t)
            return m;
            if(a[l]==t)
            return l;
            if(a[r]==t)
            return r;

            if(a[l]<=a[m])
            {
                if(t>=a[l] && t<=a[m])
                    r=m-1;
                else
                    l=m+1;
            }
            else
            {
                if(t>=a[m] && t<=a[r])
                    l=m+1;
                else
                    r=m-1;
            }
        }

        return -1;
        
    }
}
