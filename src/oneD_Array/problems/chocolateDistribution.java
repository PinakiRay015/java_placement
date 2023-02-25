//java program to perform the chocolate distribution problem of geeks for geeks
package oneD_Array.problems;

import java.util.Arrays;

public class chocolateDistribution {
    public static int min_Diff(int []array , int m , int n)
    {
        int md = Integer.MAX_VALUE; //minimum difference
        Arrays.sort(array);
        for(int i = 0 ; i+m-1<n ; i++)
        {
            md = Math.min((array[i+m-1] - array[i]) , md);
        }
        return md;
    }
    public static void main(String[] args) {
        int []array = { 12, 4,  7,  9,  2,  23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };
        int m  = 7; //number of students
        int n = array.length; //size of the integer
        System.out.println("The minimum difference is "+min_Diff(array , m , n));
    }
}
