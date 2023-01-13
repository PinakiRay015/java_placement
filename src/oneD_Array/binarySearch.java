//java program to perform binary search in an array
package oneD_Array;
import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static int binSearch(int []array , int key)
    {
        int start = 0;
        int end = array.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(array[mid]==key)
            {
                return mid;
            }
            else if(array[mid]<key)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int []array = new int[size];
        System.out.println("Enter the elements inside the array");
        for(int i = 0 ; i<array.length ; i++)
        {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Here is your array in sorted order");
        for(int i =0; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
        System.out.println("\nEnter the key");
        int key = sc.nextInt();
        int position = binSearch(array , key);
        if(position==-1)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("Your element is in index position "+position);
        }
    }
}
