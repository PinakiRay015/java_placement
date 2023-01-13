//java program to find the second-largest element in an array
package oneD_Array;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargestNum {
    public static int secondLargestNum(int []array)
    {
        int num = Integer.MIN_VALUE;
        for(int i =0 ; i< array.length-1 ; i++)
        {
            if(num<array[i])
            {
                num = array[i];
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter all the elements inside the array");
        for(int i =0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Here is the array list in a sorted way");
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\nYour second largest element is "+secondLargestNum(arr));
    }
}
