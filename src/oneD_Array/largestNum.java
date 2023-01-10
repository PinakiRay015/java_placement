//java program to find the largest element in an array
package oneD_Array;
import java.util.Scanner;
public class largestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int larest = 0;
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int []array = new int[size];
        for(int i = 0 ; i< array.length ; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Here is your array");
        for(int i =0 ; i< array.length ; i++)
        {
            System.out.print(array[i]+"\t");
            if(larest<array[i])
            {
                larest = array[i];
            }
        }
        System.out.println("\nThe largest element is "+larest);
    }
}
