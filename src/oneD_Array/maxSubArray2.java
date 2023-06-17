//java program to find the maximum subArray sum using prefix array method
package oneD_Array;

public class maxSubArray2 {
    public static int myMax2(int []array)
    {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int []prefixArray = new int[array.length];
        prefixArray[0] = array[0];
        for(int i=1 ; i<array.length ; i++)
        {
            prefixArray[i] = prefixArray[i-1] + array[i];
        }

        for(int start = 0 ; start<array.length ; start++)
        {
            for(int end = start ; end<array.length ; end++)
            {
                currentSum = (start == 0 ) ? prefixArray[end] : prefixArray[end] - prefixArray[start-1];
                maxSum = Math.max(currentSum , maxSum);
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int []array = {1 , -2 , 6 , -1 , 3};
        System.out.println(myMax2(array));
    }
}
