class Solution {
    public String longestPalindrome(String s) 
    {
        int max=0, start=0, l, r;
        for(int i=0;i<s.length();i++)
        {
            //odd case
            l=i;
             r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {
                if((r-l+1)>max)
                {
                    max=r-l+1;
                    start=l;
                }
                r++;
                l--;
            }
            //even case
            l=i;
            r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {
                if((r-l+1)>max)
                {
                    max=r-l+1;
                    start=l;
                }
                r++;
                l--;
            }
        }
        return s.substring(start,start+max);
    }
}
