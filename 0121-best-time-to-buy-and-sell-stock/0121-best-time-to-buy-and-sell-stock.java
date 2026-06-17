class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit=0, potentialProfit = 0;
    

        for (int currentPrice: prices){
             // Fix 4: Dropped the prices[] brackets. currentPrice IS the value.
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }

            potentialProfit = currentPrice - minPrice;
            
            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
            }
            
        }
        return maxProfit;
    }
}