//java program to find the max subArray sum by prefix-Sum method
package oneD_Array;

public class maxSubArray2 {
    public static int myMax2(int []array)
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int []prefixArray = new int[array.length];
        prefixArray[0] = array[0];
        for(int i=1 ; i<prefixArray.length ; i++)
        {
            prefixArray[i] = prefixArray[i-1] + array[i];
        }
        for(int i=0 ; i<array.length ; i++)
        {
            for(int j=i+1 ; j<array.length ; j++)
            {
                currSum = prefixArray[j] - prefixArray[i+1];
            }

            maxSum = Math.max(currSum , maxSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int []array = {1 , -2 , 6 , -1 , 3};
        System.out.println(myMax2(array));
    }
}
