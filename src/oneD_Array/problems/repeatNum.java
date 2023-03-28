//java program to check the repeated number in an array
package oneD_Array.problems;

import java.util.Arrays;

public class repeatNum {
    public static Boolean checkRepeat(int []array)
    {
        Arrays.sort(array);
        for(int i = 0 ; i<array.length-1 ; i++)
        {
            if(array[i]==array[i+1])
            {
                return true;
            }
            break;
        }
        return false;
    }
    public static void main(String[] args) {
        int []array = {1 ,1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(checkRepeat(array));
    }
}
