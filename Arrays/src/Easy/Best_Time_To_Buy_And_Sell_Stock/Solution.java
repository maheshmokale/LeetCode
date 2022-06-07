package Easy.Best_Time_To_Buy_And_Sell_Stock;
 class Solution {
    public static void main(String[] args){
        Solution solution=new Solution();
        int[] prices={2,1,6,4,8,3,7};
        System.out.print(solution.maxProfit(prices));

    }
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int sell=0;
        for (int i = 0; i < prices.length; i++) {
            buy=Math.min(buy,prices[i]);
            sell=Math.max(sell,prices[i]-buy);
        }
        return sell;
    }

}

