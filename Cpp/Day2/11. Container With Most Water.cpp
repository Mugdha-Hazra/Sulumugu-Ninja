class Solution {
public:
    int maxArea(vector<int>& a)
    {
        int maxlen=0, l=0, r=a.size()-1;
        while(l<r)
        {
            maxlen=max(maxlen,min(a[l],a[r])*(r-l));
            if(a[l]>a[r])
            r--;
            else
            l++;
        }
        return maxlen;
    }
};
