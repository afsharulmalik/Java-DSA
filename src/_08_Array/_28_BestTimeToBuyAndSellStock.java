package _08_Array;

public class _28_BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        int profit = 0;

        for(int price : prices){

            if(price < minPrice){
                minPrice = price;
            }

            profit = price - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
