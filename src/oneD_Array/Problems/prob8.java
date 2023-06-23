//java trapping rain water practice
package oneD_Array.Problems;

public class prob8 {
    public static int getTrappedWater(int []height)
    {
        int n = height.length;
        int []leftMost = new int[n];
        leftMost[0] = height[0];
        int []rightMost = new int[n];
        rightMost[n-1] = height[n-1];

        for(int i=1 ; i<n ; i++)
        {
            leftMost[i] = Math.max(leftMost[i-1] , height[i]);
        }

        for(int i=n-2 ; i>=0 ; i--)
        {
            rightMost[i] = Math.max(rightMost[i+1] , height[i]);
        }

        int waterTrapped = 0;
        for(int i=0 ; i<n ; i++)
        {
            int waterLevel = Math.min(rightMost[i] , leftMost[i]);
            waterTrapped += waterLevel - height[i];
        }

        return waterTrapped;
    }
    public static void main(String[] args) {
        int []height = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(getTrappedWater(height));
    }
}
