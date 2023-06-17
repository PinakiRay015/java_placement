//java program to find the maximum subArray sum using Kadane's algorithm
package oneD_Array;

public class maxSubArray3 {
    public static int myMax3(int []array)
    {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<array.length ; i++)
        {
            currentSum = currentSum + array[i];
            if(currentSum<0)
            {
                currentSum=0;
            }

            maxSum = Math.max(currentSum , maxSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int []array = {1 , -2 , 6 , -1 , 3};
        System.out.println(myMax3(array));
    }
}
