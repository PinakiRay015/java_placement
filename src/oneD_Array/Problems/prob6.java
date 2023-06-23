//java program to find the element in rotated sorted array
package oneD_Array.Problems;

public class prob6 {
    public static int searchOnRotatedArray(int []array , int key)
    {
        int start = 0;
        int end = array.length-1;
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(array[mid] == key)
            {
                return mid;
            }

            if(array[start] < array[mid])
            {
                if(key >= array[start] && key < array[mid])
                {
                    end = mid-1;
                }
                else
                {
                    start = start + 1;
                }
            }

            else
            {
                if(key >= array[mid] && key<array[end])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid-1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int []array = {4,5,6,7,0,1,2};
        int position = searchOnRotatedArray(array , 0);
        System.out.println((position == -1) ? "Not Found" : position);
    }
}
