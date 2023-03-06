//java program to find the maximum sub of the sub array(brute Force)
package oneD_Array;

public class maxSubArraySum1 {
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
        int []array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The maximum sum of the sub array is "+getMaxSum(array));
    }
}
