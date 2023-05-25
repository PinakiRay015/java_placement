//java program to perform fibonacci series
import java.util.Scanner;
public class fibonacci {
    public static void createFibonacci(int []arr)
    {
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2 ; i<arr.length ; i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
        }
    }

    public static void display(int []arr)
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int []arr = new int[size];
        createFibonacci(arr);
        display(arr);
    }
}
