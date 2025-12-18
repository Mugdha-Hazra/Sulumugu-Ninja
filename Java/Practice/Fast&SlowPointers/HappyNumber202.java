class Solution {
    public int sumOfSq(int n)
    {
        int s=0;
        while(n>0)
        {
            s+=(n%10)*(n%10);
            n/=10;
        }
        return s;
    }
    public boolean isHappy(int n) 
    {
        int slow=n, fast=n;
        while(fast!=1)
        {
            slow=sumOfSq(slow);
            fast=sumOfSq(sumOfSq(fast));
            if(fast==1)
            return true;

            if(slow==fast)
            return false;
        }
        return true;
    }
}
