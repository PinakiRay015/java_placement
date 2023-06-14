package oneD_Array;

public class maxSubArray1 {
    public static int myMax1(int []array)
    {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int start = 0 ; start<array.length; start++)
        {
            for(int end = start+1 ; end<array.length ; end++)
            {
                currSum = 0;
                for(int k=start ; k<=end ; k++)
                {
                    currSum += array[k];
                }

                maxSum = Math.max(currSum , maxSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args)
    {
        int[] array = {2 , 4 , 6 , 8 , 10};
        System.out.println(myMax1(array));
    }
}
