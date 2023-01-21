//java program to calculate the trapped Rainwater
package oneD_Array.problems;

public class trappingRainwater {
    public static int trappedWater(int []height)
    {
        //calculate the left max boundary
        int []leftMax = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1 ; i<height.length ; i++)
        {
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }
        //calculate the right max boundary
        int []rightMax = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2 ; i>=0 ; i--)
        {
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }
        //run the loop
        int totalTrappedWater = 0;
        for(int i = 0 ; i<height.length ; i++)
        {
            //calculate the water level for each bar
            int waterLevel = Math.min(leftMax[i] , rightMax[i]);
            //calculate the trapped water
            totalTrappedWater += waterLevel-height[i];
        }
        return totalTrappedWater;
    }
    public static void main(String[] args) {
        int [] height = {4 , 2 , 0 , 6 , 3 , 2 ,5};
        System.out.println(trappedWater(height));
    }
}
