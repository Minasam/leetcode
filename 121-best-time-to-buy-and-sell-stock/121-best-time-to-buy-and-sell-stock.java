class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int price: prices){
            profit = Math.max(profit, price - min);
            min = Math.min(min, price);
        }
        return profit;
    }
}