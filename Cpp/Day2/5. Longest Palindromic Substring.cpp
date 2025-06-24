class Solution {
public:
    string longestPalindrome(string s) 
    {
        int maxlen=0;
        int start =0;
        //oddlength
        for(int i=0;i<s.size();i++)
        {

            int l=i,r=i;
            while(l>=0&&r<s.size()&&s[l]==s[r])
            {
               // maxlen=max(r-l+1,maxlen);
               if(r-l+1>maxlen)
               {
                maxlen=r-l+1;
                start=l;
               }


                l--;
                r++;
            }

        
        //even length

         l=i, r=i+1;
        while(l>=0&&r<s.size()&&s[l]==s[r])
        {
             //maxlen=max(r-l+1,maxlen);
             if(r-l+1>maxlen)
               {
                maxlen=r-l+1;
                start=l;
               }
             l--;
             r++;

        }
        }
        return s.substr(start,maxlen);
        
    }
};
