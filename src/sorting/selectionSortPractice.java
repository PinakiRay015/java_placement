package sorting;

public class selectionSortPractice {
    public static void myselectionSort(int []array)
    {
        for(int i = 0 ; i<array.length ; i++)
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
        for(int i=0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int []array = {5,4,1,3,2};
        display(array);
        System.out.println("\n");
        myselectionSort(array);
        display(array);
    }
}
