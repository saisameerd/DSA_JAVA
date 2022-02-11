package Arrays;

public class buyAndSell {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0 ;
        for(int i  = 0 ; i < prices.length ; i++){
           buy = Math.min(buy,prices[i]);
            sell= Math.max(sell,prices[i] - buy);
        }
        
        if(sell <= 0) return 0;
        
        return sell;
    }
}
