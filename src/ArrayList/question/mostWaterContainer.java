//container with most water
package ArrayList.question;

import java.util.ArrayList;

public class mostWaterContainer {

    public static int mostWater(ArrayList<Integer> myArray)
    {
        int maxWater = Integer.MIN_VALUE;
        int trappedWater = 0;
        int leftPoint = 0;
        int rightPoint = myArray.size()-1;

        while(leftPoint<rightPoint)
        {
            int height = Math.min(myArray.get(leftPoint) , myArray.get(rightPoint));
            int width = rightPoint - leftPoint;
            trappedWater = height * width;
            maxWater = Math.max(maxWater , trappedWater);

            if(myArray.get(leftPoint) < myArray.get(rightPoint))
            {
                leftPoint++;
            }
            else
            {
                rightPoint--;
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList <Integer> myArray = new ArrayList<>();
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
