//java program to check weather a given array is sorted or not using recursion
package Recursion;

public class checkSorted {
    public static boolean isSorted(int []array , int i)
    {
        if(i == array.length-1)
        {
            return true;
        }
        if(array[i] > array[i+1])
        {
            return false;
        }
        return isSorted(array , i+1);

    }
    public static void main(String[] args)
    {
        int []array = {10 , 20 , 30 , 40 , 50};
        System.out.println(isSorted(array , 0));
    }
}
