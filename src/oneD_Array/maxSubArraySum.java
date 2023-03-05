//java program to find the maximum sub of the sub array
package oneD_Array;

public class maxSubArraySum {
    public static int getMaxSum(int [] array)
    {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<array.length; i++)
        {
            for(int j=i ; j<array.length ; j++)
            {
                int currentSum = 0;
                for(int k = i ; k<=j ; k++)
                {
                    currentSum += array[k];
                }
                maxSum = Math.max(currentSum , maxSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int []array = {2,4,6,8,10};
        System.out.println("The maximum sum of the sub array is "+getMaxSum(array));
    }
}
