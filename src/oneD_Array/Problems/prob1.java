//java program to find the largest number in array using linear search
package oneD_Array.Problems;

public class prob1 {
    public static int largestNum(int []array)
    {
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<array.length ; i++)
        {
            largest = Math.max(largest , array[i]);
        }
        return largest;
    }
    public static void main(String[] args) {
        int []array = {1 , 2  , 6 , 3 , 5};
        System.out.println("The largest number of the array is "+largestNum(array));
    }
}
