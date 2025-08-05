class Solution {
public:
    bool exist(vector<vector<char>>& b, string w) 
    {
        int r=b.size(), c=b[0].size();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(dfs(b,w,i,j,0))
                return true;
            }
        }
        return false;
    }

    private:
    bool dfs(vector<vector<char>>&b,string &w, int r, int c, int idx)
    {
        if(idx==w.size())
        return true;
        if(r<0||r>=b.size()||c<0||c>=b[0].size()) 
        return false;
        if(b[r][c]!=w[idx]) 
        return false;
        char t=b[r][c];
        b[r][c]='#';
        bool found=(
            dfs(b,w,r+1,c,idx+1)||dfs(b,w,r-1,c,idx+1)||dfs(b,w,r,c-1,idx+1)||dfs(b,w,r,c+1,idx+1)
        );
        b[r][c]=t;
        return found;


    }
};
