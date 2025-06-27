class Solution {
public:
    void backtrack(int start, int target,vector<int>& candidate,vector<int>& combination,vector<vector<int>>&result)
    {
        if(target==0)
        {
            result.push_back(combination);
            return;
        }
        for(int i=start;i<candidate.size();i++)
        {
            if(candidate[i]>target)
            continue;
            combination.push_back(candidate[i]);
            backtrack(i,target-candidate[i],candidate,combination,result);
            combination.pop_back();
        }
    }
    vector<vector<int>> combinationSum(vector<int>& candidate, int target)
    {
        sort(candidate.begin(),candidate.end());
        vector<vector<int>>result;
        vector<int>combination;
        backtrack(0,target,candidate,combination,result);
        return result;
    }
};
