class Solution {
public:
    int findMin(vector<int>& a) {
        int n=a.size()-1;
        if(a[0]<a[n])
        return a[0];
        int l=0,h=n;
        while(l<h)
        {
            int m=(l+h)/2;
            if(a[m]>a[h])
            l=m+1;
            else
            h=m;
        }
        return a[l];
    }
};
