package sorting.problem;

public class selectionSortDecrease {
    public static void selectionSort(int []array)
    {
        for(int i=0 ; i<array.length-1 ; i++)
        {
            int min = i;
            for(int j=i+1 ; j<array.length ; j++)
            {
                if(array[min] < array[j])
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
        for(int i=0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int []array = {3 , 6 , 2 , 1 , 8 , 7 , 4 , 5 , 3 , 1};
        display(array);
        selectionSort(array);
        System.out.println("\nThe array is sorted with  selection sort in DECREASE ORDER 👇");
        display(array);
    }
}
