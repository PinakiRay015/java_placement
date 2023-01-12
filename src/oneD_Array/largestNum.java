//java program to find the largest element in an one dimensional array
package oneD_Array;
import java.util.*;
public class largestNum {
    public static int getLargest(int []array)
    {
        int largest = Integer.MIN_VALUE; //setting the value lowest i.e. minus infinity
        for(int i = 0 ; i<array.length ; i++)
        {
            if(largest<array[i])
            {
                largest = array[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int [] array = {14 , 5 , 67 , 21 , 67 , 83 , 54 , 34 , 3 , 7 , 2};
        System.out.println("Here is your array");
        for(int i =0  ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
        System.out.println("\nThe largest element is "+getLargest(array));
    }
}
