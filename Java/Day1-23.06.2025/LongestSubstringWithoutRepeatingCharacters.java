class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        Map<Character,Integer> map=new HashMap<>();
        
        int l=0, maxLen=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(map.containsKey(c) && map.get(c)>=l)
            {
                l=map.get(c)+1;
            }
                map.put(c,i);
            
            maxLen=Math.max(maxLen,i-l+1);
        }

        return maxLen;

        
    }
}
