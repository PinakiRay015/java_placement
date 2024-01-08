// java program to find two pair elements from an arraylist who sum will be equal to target number
package ArrayList.question;

import java.util.ArrayList;
import java.util.Arrays;

public class pairSum1 {
    public static int [] findPair(ArrayList<Integer> list , int target)
    {
        int first = 0;
        int last = list.size()-1;

        while(first < last)
        {
            int sum = list.get(first) + list.get(last);
            if(sum == target)
            {
                return new int[]{list.get(first) , list.get(last)};
            }
            else if(sum > target)
            {
                last--;
            }
            else
            {
                first++;
            }
        }
        return new int[]{0 , 0};
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int []array = findPair(list , 5);
        System.out.println(Arrays.toString(array));
    }
}
