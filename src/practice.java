import java.util.Arrays;

public class practice {
    public static int secondLargestElement(int []array)
    {
        Arrays.sort(array);
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0 ; i<array.length-1 ; i++)
        {
            if(secondLargest<array[i])
            {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int []array = {43 , 12 , 54, 2 , 78 , 17};
        System.out.println("Here is ur array");
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
        System.out.println("\nSecond largest number in ur array "+secondLargestElement(array));
    }
}
