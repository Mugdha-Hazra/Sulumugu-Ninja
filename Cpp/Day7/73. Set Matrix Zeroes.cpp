class Solution {
public:
    void setZeroes(vector<vector<int>>& a) {
        int n = a.size(), m = a[0].size();
        bool fr = false, fc = false;

        // Check first column for zeros
        for(int i = 0; i < n; i++)
            if(a[i][0] == 0)
                fc = true;

        // Check first row for zeros
        for(int j = 0; j < m; j++)
            if(a[0][j] == 0)
                fr = true;

        // Mark corresponding row and column in first cell
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(a[i][j] == 0) {
                    a[i][0] = 0;
                    a[0][j] = 0;
                }
            }
        }

        // Set matrix cells to zero based on flags
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(a[i][0] == 0 || a[0][j] == 0)
                    a[i][j] = 0;
            }
        }

        // Zero out first row and column if needed
        if(fc)
            for(int i = 0; i < n; i++)
                a[i][0] = 0;

        if(fr)
            for(int j = 0; j < m; j++)
                a[0][j] = 0;
    }
};
