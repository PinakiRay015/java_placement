//java program to find the maximum profit
package oneD_Array.problems;

public class stocks {
    public static int getMaxProfit(int [] array)
    {
        int buyingPrice = array[0];
        int maxProfit = 0;
        for(int i = 1 ; i<array.length ; i++)
        {
            if(buyingPrice < array[i])
            {
                maxProfit = Math.max(array[i] - buyingPrice , maxProfit);
            }
            else
            {
                buyingPrice = array[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args)
    {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(getMaxProfit(prices));
    }
}
