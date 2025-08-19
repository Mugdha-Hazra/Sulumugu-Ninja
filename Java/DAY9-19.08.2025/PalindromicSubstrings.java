/*
  https://leetcode.com/problems/palindromic-substrings/
*/
class Solution {
    public int calcPalindrome(String s, int l, int r)
    {
        int count=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            count+=1;
            l--;
            r++;
        }
        return count;
    }
    public int countSubstrings(String s) 
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            sum+=calcPalindrome(s,i,i);
            sum+=calcPalindrome(s,i,i+1);
        }
        return sum;
        
    }
}
