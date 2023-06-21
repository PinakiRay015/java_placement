//java program to find the maximum profit by choosing a buying date and selling date
package oneD_Array.Problems;

public class prob4 {
    public static int maxProfit(int []prices)
    {
        int []aux = new int[prices.length];
        int maxProfit = 0;
        aux[prices.length-1] = prices[prices.length-1];
        for(int i=prices.length-2 ; i>=0 ; i--)
        {
            aux[i] = Math.max(aux[i+1] , prices[i]);
        }

        for(int i=0 ; i<aux.length ; i++)
        {
            maxProfit = Math.max(maxProfit , aux[i]-prices[i]);
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
