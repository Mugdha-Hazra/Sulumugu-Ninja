class Solution {
    public boolean isPalindrome(String s) 
    {
        int i=0, j=s.length()-1;
        while(i<j)
        {
            if(!Character.isLetter(s.charAt(i)))
            {
                i++;
                continue;
            }
            if(!Character.isLetter(s.charAt(j)))
            {
                j--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
            return false;
            i++;
            j--;
        }
        return true;
        
    }
}
