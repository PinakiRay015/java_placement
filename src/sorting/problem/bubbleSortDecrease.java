//java program to perform bubble sort in decrease order
package sorting.problem;

public class bubbleSortDecrease {
    public static void bubbleSort(int []array)
    {
        for(int turn = 0 ; turn<array.length-1 ; turn++)
        {
            for(int j = 0 ; j<array.length-1-turn ; j++)
            {
                if(array[j]<array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


    public static void display(int []array)
    {
        for(int i=0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String [] args)
    {
        int []array = {3 , 6 , 2 , 1 , 8 , 7 , 4 , 5 , 3 , 1};
        display(array);
        System.out.println("The array sorted in bubble sort 👇\n");
        bubbleSort(array);
        display(array);

    }
}
