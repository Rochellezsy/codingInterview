package Primary_algorithm.Chapter1;

public class T2 {
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int temp=prices[i]-prices[i-1];
            if(temp>0){
                profit=profit+temp;
            }

        }
        return profit;

    }
}
