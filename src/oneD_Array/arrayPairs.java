//java program to find out pairs in array
package oneD_Array;

public class arrayPairs {
    public static void myPairs(int []array)
    {
        for(int i=0 ; i<array.length-1 ; i++)
        {
            for(int j=i+1 ; j<array.length ; j++)
            {
                System.out.print("("+array[i]+" , "+array[j]+")"+"\t");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int []array = {2,4,6,8,10};
        myPairs(array);
    }
}
