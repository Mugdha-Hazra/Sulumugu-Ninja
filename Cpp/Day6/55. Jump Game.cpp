class Solution {
public:
    bool canJump(vector<int>& n) {
        int maxd=0;
        for(int i=0;i<n.size();i++)
        {
            if(i>maxd) return false;
            maxd=max(maxd,i+n[i]);
        }

        return true;

    }
};
