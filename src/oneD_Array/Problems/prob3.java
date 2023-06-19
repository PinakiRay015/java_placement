//java program to calculate the trappedWater
package oneD_Array.Problems;
public class prob3 {
    public static int trappedWater(int []height , int widthOfBar)
    {
        int []leftMostBar = new int[height.length];
        leftMostBar[0] = height[0];
        int []rightMostBar = new int[height.length];
        rightMostBar[height.length-1] = height[height.length-1];

        //calculating left most boundary
        for(int i=1 ; i<leftMostBar.length ; i++)
        {
            leftMostBar[i] = Math.max(leftMostBar[i-1] , height[i]);
        }

        //calculating right most boundary
        for(int i=rightMostBar.length-2 ; i>=0 ; i--)
        {
            rightMostBar[i] = Math.max(rightMostBar[i+1] , height[i]);
        }

        int trappedWater = 0;
        for(int i=0 ; i<height.length ; i++)
        {
            //finding the minimum waterLevel of each bar
            int waterLevel = Math.min(leftMostBar[i] , rightMostBar[i]);
            //calculating the trappedWater
            trappedWater += (waterLevel - height[i]) * widthOfBar;
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int []height = {4 , 2 , 0 , 6 , 3 , 2 , 5};
        System.out.println(trappedWater(height , 1));
    }
}
