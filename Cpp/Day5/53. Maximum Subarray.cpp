class Solution {
public:
    int maxSubArray(vector<int>& n) 
    {
        int c=n[0],m=n[0];
        for(int i=1;i<n.size();i++)
        {
            c=max(n[i],c+n[i]);
            m=max(m,c);
        }
        return m;
    }
};
