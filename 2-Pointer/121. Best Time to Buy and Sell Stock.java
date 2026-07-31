// https://leetcode.com/problems/best-time-to-buy-and-sell-stock?listId=552y65ke&page=1

class Solution {
    public int maxProfit(int[] prices) {
         int max = 0;
         int bp = prices[0];
         for(int i =1;i<prices.length;i++){
          int  sp = prices[i];
            if(bp<sp){
                int profit = sp-bp;
                max = Math.max(profit,max);
            }
            else{
                bp = sp;
            }
         }
         return max;
    }
}