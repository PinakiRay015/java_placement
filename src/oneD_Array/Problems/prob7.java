//java best time to buy and sell stock problem practice
package oneD_Array.Problems;

public class prob7 {
    public static int maxProfit(int []prices)
    {
        int profit = 0;
        int []aux = new int[prices.length];
        aux[prices.length-1] = prices[prices.length-1];
        for(int i=prices.length-2 ; i>=0 ; i--)
        {
            aux[i] = Math.max(aux[i+1]  , prices[i]);
        }

        for(int i=0 ; i<prices.length ; i++)
        {
            profit = Math.max(profit , aux[i]-prices[i]);
        }

        return profit;
    }
    public static void main(String[] args) {
        int []prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
