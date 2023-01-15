//java program to print sub arrays
package oneD_Array;

public class subArrays {
    public static void printSubArray(int []array)
    {
        for(int i = 0  ; i<array.length ; i++)
        {
            for(int j = i+1 ; j<array.length ; j++)
            {
                for(int z=i ; z<j ; z++)
                {
                    System.out.print(array[z]+"\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int []array = {2 , 4 , 6 , 8 , 10 , 12};
        System.out.println("Here is your array");
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
        System.out.println("\nHere is your sub-arrays");
        printSubArray(array);
    }
}
