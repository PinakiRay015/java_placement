package samples;

import java.util.Arrays;

public class prob1 {
    public static int pairSum(int []arr , int target)
    {
        int count = 0;
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length-1;
        while(left < right)
        {
            int sum = arr[left] + arr[right];
            if(sum == target)
            {
                count++;
                left++;
                right--;
            }
            else if(sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int [] arr = {1,5,7,-1};
        System.out.println(pairSum(arr , 6));
    }
}
