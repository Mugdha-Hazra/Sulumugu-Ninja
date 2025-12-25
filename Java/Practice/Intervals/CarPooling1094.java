class Solution {
    public boolean carPooling(int[][] trips, int capacity)
    {
        Map<Integer, Integer> map=new TreeMap<>();
        for(int[] i:trips)
        {
            map.put(i[1], map.getOrDefault(i[1],0)+i[0]);
            map.put(i[2], map.getOrDefault(i[2],0)-i[0]);
        }
        int passengers=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            passengers+=entry.getValue();

            if(passengers>capacity)
            return false;
        }
        return true;
        
    }
}
