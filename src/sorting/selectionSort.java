//java program to perform selection sort
package sorting;

public class selectionSort {
    public static void mySelectionSort(int []array)
    {
        for(int i = 0 ; i<array.length-1 ; i++)
        {
            int min = i;
            for(int j=i+1 ; j<array.length ; j++)
            {
                if(array[min]>array[j])
                {
                    min = j;
                }
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;

        }
    }

    public static void display(int []array)
    {
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int []array = {5 , 4 , 1 , 3 , 2};
        mySelectionSort(array);
        display(array);
    }
}
