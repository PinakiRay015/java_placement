//java program to check if a given array is sorted or not
package oneD_Array.problems;

public class checkSorted {
    public static boolean checkArray(int []array , int n)
    {
        if(n==0 || n==1)
        {
            return true;
        }

        for(int i=1 ; i<array.length ; i++)
        {
            if(array[i-1] > array[i])
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args)
    {
        int []array = {10 , 20 , 30 , 60 , 50};
        int n = array.length;
        System.out.println(checkArray(array , n));
    }
}
