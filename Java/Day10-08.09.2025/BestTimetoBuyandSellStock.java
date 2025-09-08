class Solution {
    public int maxProfit(int[] prices) 
    {
        int min=prices[0], profit=0;
        for(int i=0;i<prices.length;i++)
        {
            min=Math.min(prices[i],min);
            profit=Math.max(prices[i]-min,profit);
        }
        return profit;

        
    }
}
