class Solution {
public:
    int lengthOfLongestSubstring(string s)
    {
        unordered_map<char,int>m;
        int l=0,maxlen=0;
        for(int i=0;i<s.size();i++)
        {
            int c=s[i];
            if(m.count(c)&&m[c]>=l)
            {
                l=m[c]+1;
            }
            m[c]=i;
            maxlen=max(maxlen,i-l+1);

        }
        return maxlen;
    }
};
