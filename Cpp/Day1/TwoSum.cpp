class Solution {
public:
    vector<int> twoSum(vector<int>& a, int t) 
    {
        unordered_map<int,int>mp;
        for(int i=0;i<a.size();i++)
        {
            int k=t-a[i];
            if(mp.find(k)!=mp.end())
            {
                return {i,mp[k]};
            }
            mp[a[i]]=i;
        }
        return {};
    }
};
