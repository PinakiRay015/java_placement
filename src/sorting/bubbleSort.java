//java program to perform bubble sort
package sorting;

public class bubbleSort {
    public static void myBubbleSort(int []array)
    {
        for(int turn = 0 ; turn<array.length-1 ; turn++)
        {
            for(int j = 0 ; j<array.length-1-turn ; j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void displayArray(int []array)
    {
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String [] args)
    {
        int []array = {5 , 4 , 1 , 3 , 2};
        System.out.println("Here is ur unsorted array");
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
        myBubbleSort(array);
        System.out.println("\nHere is ur sorted array");
        displayArray(array);
    }
}
