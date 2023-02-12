//java program to search the element at the rotated sorted array
import java.util.Scanner;

public class RotatedSortedSearch {
    public static int myBinarySearch(int []array , int key)
    {
        int start = 0;
        int last = array.length-1;
        while(start<=last)
        {
            int mid = (start+last)/2;
            if(array[mid] == key)
            {
                return mid;
            }

            else if(array[start]<array[mid])
            {
                if(key >= array[start] && key < array[mid])
                {
                    last = mid-1;
                }

                else
                {
                    start = mid+1;
                }
            }

            else
            {
                if(key>array[mid] && key<array[last])
                {
                    start = mid+1;
                }
                else
                {
                    last = mid-1;
                }
            }
        }

        return -1;
    }

    public static void display(int []array)
    {
        for(int i =0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int []array = {4,5,6,7,0,1,2,3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Here is your array");
        display(array);
        System.out.println("\nEnter the key");
        int key = sc.nextInt();
        int position = myBinarySearch(array , key);
        if(position==-1)
        {
            System.out.println("Not found!!!");
        }
        else
        {
            System.out.println("Array found at index = "+position);
        }
    }
}
