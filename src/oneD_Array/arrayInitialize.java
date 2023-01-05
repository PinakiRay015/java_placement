package oneD_Array;
import java.util.Scanner;

public class arrayInitialize {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //method 1
//        int []array1 = {10 , 20 , 30 , 40 , 50};
//        System.out.println("Here is your array");
//        for(int i = 0 ; i< array1.length ; i++)
//        {
//            System.out.println(array1[i]);
//        }
//
        //method 2
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int [] array2 = new int[size];
        for(int i=0 ; i< array2.length ; i++)
        {
            array2[i] = sc.nextInt();
        }
        System.out.println("Here is your array");
        for(int i = 0 ; i< array2.length ; i++)
        {
            System.out.println(array2[i]);
        }

        sc.close();
    }
}
