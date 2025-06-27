class Solution {
    
    public void backtracking(int start, int target, int[] candidates,List<Integer> temp, List<List<Integer>> result)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++)
        {
            if(candidates[i]>target)
            continue;
            temp.add(candidates[i]);
            backtracking(i,target-candidates[i],candidates,temp,result);
            temp.remove(temp.size()-1);
        }
        
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtracking(0,target,candidates,temp,result);
        return result;
    }
}
