//java program to find the pairs in array
package oneD_Array;

public class arrayPairs {
    public static void pairing(int []array)
    {
        for(int i = 0 ; i<array.length ; i++)
        {
            for(int j = i+1 ; j<array.length ; j++)
            {
                System.out.print("("+array[i]+","+array[j]+")\t");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int []array = {2 , 4 , 6 , 8 , 10};
        System.out.println("Here is your array");
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
        System.out.println("\nHere is ur pairs");
        pairing(array);
    }
}
