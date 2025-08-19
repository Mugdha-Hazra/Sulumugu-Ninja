class Solution {
public:
    int palindromeCount(string s, int l, int r)
    {
        int a=0;
        while(l>=0&&r<s.size()&&s[l]==s[r] )
            {       a+=1;
                    l--;
                    r++;
            }
        return a;
    }
    int countSubstrings(string s) 
    {
        int a=0;
        for(int i=0;i<s.size();i++)
        {
            a+=palindromeCount(s,i,i);
            a+=palindromeCount(s,i,i+1);
        }

        return a;
    }
};
