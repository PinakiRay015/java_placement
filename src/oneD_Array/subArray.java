//java program to print the sub array
package oneD_Array;

public class subArray {
    public static void mySubArray(int []array)
    {
        for(int start = 0 ; start<array.length ; start++)
        {
            for(int end = start ; end<array.length ; end++)
            {
                for(int k=start ; k<=end ; k++)
                {
                    System.out.print(array[k]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int []array = {2,4,6,8,10};
        mySubArray(array);
        System.out.println("The total number of sub array is "+(array.length*(array.length+1))/2 );
    }
}
