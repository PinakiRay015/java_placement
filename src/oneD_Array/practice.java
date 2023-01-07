//java program to practice the array
package oneD_Array;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.println("Enter the elements inside the array");
        for(int i = 0 ; i<array.length ; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Here is your array");
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
}
