//java program to perform linear search in an one dimensional array
package oneD_Array;

import java.util.Scanner;
public class linearSearch {
    public static int mySearch(int []numbers , int key)
    {
        for(int i =0 ; i<numbers.length ; i++)
        {
            if(key == numbers[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []array = {10 , 56 , 73 , 67 , 12};
        System.out.println("Here is ur array");
        for(int i =0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
        System.out.println("\nEnter the key");
        int key = sc.nextInt();
        int position = mySearch(array , key);
        if(position==-1)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("The element is present5 at the index position "+position);
        }
    }
}
