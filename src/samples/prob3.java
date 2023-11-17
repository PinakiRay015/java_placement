//java program to find the missing number
package samples;
import java.util.*;
public class prob3 {
    public static int missingNum(int[] arr)
    {
        int largestElement = arr.length;
        int totalSum = ((largestElement+1) * (largestElement+2))/2;
        for(int i=0 ; i<arr.length ; i++)
        {
            totalSum -= arr[i];
        }

        return totalSum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int [] nums = {1,5,2,6,4};
        System.out.println(missingNum(nums));
    }
}
