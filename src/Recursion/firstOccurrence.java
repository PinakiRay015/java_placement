//java program to find the first Occurrence of a number in a given array
package Recursion;

public class firstOccurrence {
    public static int Occurrence(int [] array , int key , int i)
    {
        if(i == array.length-1)
        {
            return -1;
        }
        if(key == array[i])
        {
            return i;
        }

        return Occurrence(array , key , i+1);
    }
    public static void main(String[] args)
    {
        int []array = {8 , 3 , 6 , 9 , 5 , 10 , 2 , 5 , 3};
        int key = 5;
        int position = Occurrence(array , key , 0);
        System.out.println((position == -1) ? "not found" : position);
    }
}
