//java program to find the maximum sum of the sub array
package oneD_Array;

public class maxSubArraySun3 {
    public static int getMax(int []array)
    {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0 ; i<array.length ; i++)
        {
            currentSum += array[i];
            maxSum = Math.max(maxSum , currentSum);
            currentSum = Math.max(currentSum , 0);
        }
        return maxSum;
    }
    public static void main(String[] args)
    {
        int []arr = {2,4,6,8,10};
        System.out.println(getMax(arr));
    }
}
