//java program to perform bubble sort
package sorting;

import java.util.Arrays;

public class bubbleSort {
    public static int [] myBubbleSort(int []array)
    {
        for(int turn = 0 ; turn<array.length-1 ; turn++)
        {
            for(int i=0 ; i<array.length-turn-1 ; i++)
            {
                if(array[i] > array[i+1])
                {
                    //swapping
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }

        return array;
    }
    public static void main(String[] args) {
        int []array = {5,4,1,3,2};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(myBubbleSort(array)));
    }
}
