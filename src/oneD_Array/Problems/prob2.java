//java program to reverse an array
package oneD_Array.Problems;

import java.util.Arrays;

public class prob2 {
    public static int [] reverseArray(int []array)
    {
        int start = 0;
        int last = array.length-1;

        while(start<last)
        {
            int temp = array[start];
            array[start] = array[last];
            array[last] = temp;

            start++;
            last--;
        }

        return array;
    }
    public static void main(String[] args) {
        int [] array = {2,4,6,8,10};
        System.out.println(Arrays.toString(reverseArray(array)));
    }
}
