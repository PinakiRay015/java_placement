//java program to get the position of an element
package oneD_Array.problems;

public class rotatedSortedArray {
    public static int getPosition(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == array[mid]) {
                return mid;
            } else if (array[start] < array[mid]) {
                if (target >= array[start] && target < array[mid]) {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            else
            {
                if(target > array[mid] && target <= array[end])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 0, 1, 2};
        int position = getPosition(array , 0);
        System.out.println((position == -1) ? "not found !!" : position);
    }
}
