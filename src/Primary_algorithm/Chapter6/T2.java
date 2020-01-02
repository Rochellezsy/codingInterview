package Primary_algorithm.Chapter6;

public class T2 {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else if(prices[i]-min>profit){
                profit=prices[i]-min;
            }

        }
        return profit;

    }
}
