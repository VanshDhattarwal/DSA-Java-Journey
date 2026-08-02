class Solution {
    public int maxProfit(int[] prices) {

        int minprice = prices [0];
        int maxprofit = 0;

        for(int i = 0 ; i <prices.length ; i++){

            if(prices[i] < minprice){
                minprice = prices[i];

            }

            // Now i will calculate profit here so basically profit will be 
            //  profit = price at which we buy that will lowest price 
            //  and price at which we sell that will be highest 

            // we will minus both of them and them simply we get our profit 

            // profit = price[i] - minprice;

            int profit = prices[i] - minprice;

            if(profit>maxprofit){
                maxprofit = profit;
            } 
        }

        return maxprofit;
        
    }
}
