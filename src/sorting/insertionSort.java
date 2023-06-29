//performing the insertion sort
package sorting;

import java.util.Arrays;

public class insertionSort {
    public static int [] myInsertionSort(int []array)
    {
        for(int i=1; i<array.length ; i++)
        {
            int temp = array[i];
            int prev = i-1;

            while(prev>=0 && array[prev] > temp)
            {
                array[prev+1] = array[prev];
                prev--;
            }

            array[prev+1] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        int []array = {5,4,1,3,2};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(myInsertionSort(array)));
    }
}
