//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max=0;
        int min=0;
        for(int i=0;i<n;i++){
            if(prices[i]-prices[min]>max){
                max = prices[i]-prices[min];
            }
            if(prices[min]>prices[i]){
                min=i;
            }
            
        }
        return max;
    }
}