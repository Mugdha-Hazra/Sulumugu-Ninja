class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String,List<String>> map=new HashMap<>();

        for(String word:strs)
        {
            int[] arr=new int[26];
            for(char c:word.toCharArray())
                arr[c-'a']++;

            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++)
            {
                sb.append("#");
                sb.append(arr[i]);
            }

            String key=sb.toString();

            if(!map.containsKey(key))
            map.put(key,new ArrayList<>());

            map.get(key).add(word);

        }
        return new ArrayList<>(map.values());
    }
}
