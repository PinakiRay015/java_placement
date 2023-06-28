//java program to perform selection sort
package sorting;

import java.util.Arrays;

public class selectionSort {
    public static int [] mySelectionSort(int []array)
    {
        for(int i=0 ; i<array.length-1 ; i++)
        {
            int min = i;
            for(int j=i+1 ; j<array.length ; j++)
            {
                min = (array[min] > array[j]) ? j : min;
            }

            //swapping if necessary
            if(min != i)
            {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int []array = {5,4,1,3,2};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(mySelectionSort(array)));

    }
}
