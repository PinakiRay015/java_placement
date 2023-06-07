//java program to perform binary search
package oneD_Array;

public class binarySearch {
    public static int myBinarySearch(int []array , int key)
    {
        int start = 0;
        int end = array.length-1;
        for(int i=0 ; i<array.length ; i++)
        {
            int middle = (start + end)/2;
            if(array[middle] == key)
            {
                return middle;
            }
            else if (array[middle] < key)
            {
                start = middle + 1;
            }
            else
            {
                end = middle-1;
            }
        }
        return -1;
    }
    public static void main(String [] args)
    {
        int []array = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println((myBinarySearch(array , key) == -1) ? "Not Found" : "Element is found at index "+myBinarySearch(array , key));
    }
}
