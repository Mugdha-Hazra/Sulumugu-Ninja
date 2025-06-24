class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& a)
    {
        vector<vector<int>>v;
        sort(a.begin(),a.end());
        for(int i=0;i<a.size();i++)
        {
            if(i>0 &&a[i]==a[i-1]) continue;
            int t=-a[i], l=i+1, r=a.size()-1;
            while(l<r)
            {
                int s=a[l]+a[r];
                if(s==t)
                {
                    v.push_back({a[i],a[l],a[r]});
                    while(l<r &&a[l]==a[l+1])l++;// removing duplicate from left
                    while(l<r &&a[r]==a[r-1])r--;// removing duplicate from right
                    l++;
                    r--;
                }
                else if(s<t)
                l++;
                else
                r--;
            }


        }
        return v;
        
    }
};
