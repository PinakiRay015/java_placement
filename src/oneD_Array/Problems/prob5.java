//check if an array contains duplicate element or not || If yes then return true other false
package oneD_Array.Problems;

import java.util.Arrays;

public class prob5 {
    public static boolean repeatedElement(int []nums)
    {
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length-1 ; i++)
        {
            if(nums[i] == nums[i+1])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []nums = {1 , 2 , 3 , 1};
        System.out.println(repeatedElement(nums));
    }
}
