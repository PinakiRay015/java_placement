package sorting;

public class bubbleSortPractice {
    public static void myBubbleSort(int []array)
    {
        for(int i =0 ; i<array.length-1 ; i++)
        {
            for(int j=0 ; j<array.length-1-i ; j++)
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

    public static void display(int []array)
    {
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int []array = {5,4,1,3,2};
        display(array);
        System.out.println("\n");
        myBubbleSort(array);
        display(array);
    }
}
