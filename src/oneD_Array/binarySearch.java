//java program to perform binary search in a sorted array
package oneD_Array;
import java.util.*;
public class binarySearch {
    public static int binarySearch(int []array , int key)
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
            else if(array[mid]>key)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int []array = {2 , 4 , 6 , 8 , 10 ,12 ,14};
        System.out.println("Here is your sorted array");
        for(int i = 0 ; i < array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
        System.out.println("\nEnter the key");
        int key = sc.nextInt();
        int position = binarySearch(array , key);
        if(position==-1)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("The element is found in the index "+position);
        }
    }
}
