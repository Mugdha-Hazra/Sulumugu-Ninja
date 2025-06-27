class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& str) 
    {
        unordered_map<string,vector<string>>mp;
        for(string &s:str)
        {
            vector<int>len(26,0);
            for(char ch: s)
            {
                len[ch-'a']++;
            }
            string ans;
            for(int i=0;i<26;i++)
            {
                ans+='#'+to_string(len[i]);
            }
            mp[ans].push_back(s);
        }

      vector<vector<string>>res;
        for(auto &i:mp)
      res.push_back(move(i.second));
        return res;
    }
};
