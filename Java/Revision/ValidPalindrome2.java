class Solution {
    public boolean palindromeHelper(String s, int i, int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s)
    {
        int i=0, j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return palindromeHelper(s,i+1,j) || palindromeHelper(s,i,j-1);
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
}
