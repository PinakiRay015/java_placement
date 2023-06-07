//java program to perform  linear search
package oneD_Array;

public class linearSearch {
    public static int mySearch(int [] array , int key)
    {
        for(int i=0 ; i<array.length ; i++)
        {
            if(array[i] == key)
            {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int []array = {2,4,6,8,9,10,12,14};
        int key = 10;
        int position = mySearch(array , key);
        System.out.println((position == -1) ? "Not found!!" : "Element is present on the index "+position);
    }
}
