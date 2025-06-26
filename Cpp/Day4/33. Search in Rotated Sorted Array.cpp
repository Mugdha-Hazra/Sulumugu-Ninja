class Solution {
public:
    int search(vector<int>& a, int t)
    {
        int l=0, r=a.size()-1, m=0;
        while(l<=r)
        {
            m=(l+r)/2;
            if(a[m]==t)
            return m;
            else if(a[l]==t)
            return l;
            else if(a[r]==t)
            return r;

            if(a[l]<=a[m])
            {
                if(a[l]<=t&&a[m]>=t)
                {
                    r=m-1;
                }
                else
                {
                    l=m+1;
                }

            }
            else
            {
                if(a[m]<=t&&a[r]>=t)
                {
                    l=m+1;
                }
                else
                {
                    r=m-1;
                }

            }
        }
        return -1;
    }
};
