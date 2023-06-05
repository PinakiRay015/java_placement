//java program to find the last occurrence of a number from a given array
package Recursion;

public class lastOccurrence {
    public static int lastIndex(int []array , int key , int i)
    {
        if(i == 0)
        {
            return -1;
        }

        if(array[i] == key)
        {
            return i;
        }

        return lastIndex(array , key , i-1);
    }
    public static void main(String[] args)
    {
        int []array = {8 , 3 , 6 , 9 , 5 , 10 , 2 , 5 , 3};
        int key = 5;
        int position = lastIndex(array , key , array.length-1);
        System.out.println((position == -1) ? "Not Found" : position);
    }
}
