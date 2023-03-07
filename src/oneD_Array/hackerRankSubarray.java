//java program to solve the HACKERRANK SubArray problem
package oneD_Array;

public class hackerRankSubarray {
    public static int getMaxSum(int []array)
    {
        int count = 0;
        int []newArray = new int[array.length];
        newArray[0] = array[0];
        for(int i=1 ; i<newArray.length ; i++)
        {
            newArray[i] = newArray[i-1] + array[i];
        }
        for(int i = 0 ; i<array.length ; i++)
        {
            for(int j=i ; j<array.length ; j++)
            {
                int currentSum = (i==0) ? newArray[j] : newArray[j] - newArray[i-1];
                if(currentSum<0)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []array = {1 , -2 , 4 , -5 , 1};
        System.out.println(getMaxSum(array));
    }
}
