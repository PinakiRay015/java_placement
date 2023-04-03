//trapping the rain water using getters and setters
package OOP;

public class trappingRainWater {
    public static void main(String[] args) {
        int []height = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        rainWater rainWater = new rainWater();
        rainWater.setTrappedWater(height);
        System.out.println(rainWater.getTrappedWater());
    }
}

class rainWater
{
    int trappedWater;

    public int getTrappedWater() {
        return trappedWater;
    }

     void setTrappedWater(int []height) {
        int n = height.length;
        int []leftmax = new int[n];
        leftmax[0] = height[0];
        for(int i = 1 ; i<leftmax.length ; i++)
        {
            leftmax[i] = Math.max(height[i] , leftmax[i-1]);
        }
        
        int []rightmax = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2 ; i>=0 ; i--)
        {
            rightmax[i] = Math.max(rightmax[i+1] , height[i]);
        }

        trappedWater = 0;
        for(int i = 0 ; i<height.length ; i++)
        {
            int waterLevel = Math.min(leftmax[i] , rightmax[i]);
            trappedWater += waterLevel - height[i];
        }
        this.trappedWater = trappedWater;
    }
}
