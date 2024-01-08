//java program to find container with most water
package ArrayList.question;

import java.util.ArrayList;

public class containerWithMostWater {
    public static int mostWater(ArrayList<Integer> myArray)
    {
        int start = 0;
        int last = myArray.size()-1;
        int maxWater =  Integer.MIN_VALUE;
        while(start < last)
        {
            int width = last - start;
            int height = Math.min(myArray.get(start) , myArray.get(last));
            int trappedWater = height * width;
            maxWater = Math.max(trappedWater , maxWater);

            if(myArray.get(start) < myArray.get(last))
            {
                start++;
            }
            else
            {
                last--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(1);
        myArray.add(8);
        myArray.add(6);
        myArray.add(2);
        myArray.add(5);
        myArray.add(4);
        myArray.add(8);
        myArray.add(3);
        myArray.add(7);
        System.out.println(mostWater(myArray));
    }
}
