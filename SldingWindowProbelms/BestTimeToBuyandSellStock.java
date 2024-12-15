package SldingWindowProbelms;

public class BestTimeToBuyandSellStock {

    public static int BesttimetoByStock(int[] prices)
    {
        int max_profit=0;
        int current_profit=0;
        int buy_price=prices[0];

        for(int i=1; i<prices.length;i++)
        {
            if(buy_price > prices[i])
                buy_price = prices[i];
            else
                current_profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit, current_profit);

        }

        return max_profit;

    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(BesttimetoByStock(prices));

    }
}
