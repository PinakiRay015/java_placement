//Given an integer array nums, return true if any
//value appears at least twice in the array, and return false if
// every element is distinct.
package oneD_Array.problems;
import java.util.*;
public class repeatNum {
    public static String checkRepeat(int []array)
    {
        String ans = "False";
        System.out.println("Here is your array");
        for(int i=0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
            for(int j=i+1 ; j<array.length ; j++)
            {
                if(array[i]==array[j])
                {
                    ans = "True";
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int []array = new int[size];
        System.out.println("Enter the elements to insert in the array");
        for(int i = 0 ; i<array.length ; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("\n"+checkRepeat(array));
    }
}
