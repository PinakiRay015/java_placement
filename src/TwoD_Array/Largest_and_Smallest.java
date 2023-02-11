//java program to find maximum and minimum number of the matrix
package TwoD_Array;

import java.util.Scanner;

public class Largest_and_Smallest {

    public static int maximum(int [][]matrix)
    {
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<matrix.length ; i++)
        {
            for(int j=0 ; j<matrix[0].length ; j++)
            {
                largest = Math.max(largest , matrix[i][j]);
            }
        }
        return largest;
    }

    public static int minimum(int [][]matrix)
    {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i<matrix.length ; i++)
        {
            for(int j=0 ; j<matrix[0].length ; j++)
            {
                smallest = Math.min(smallest , matrix[i][j]);
            }
        }
        return smallest;
    }

    public static void display(int [][]matrix)
    {
        for(int i = 0 ; i<matrix.length ; i++)
        {
            for(int j=0 ; j<matrix[0].length ; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]matrix = new int[3][3];
        System.out.println("Enter the data in the matrix");
        for(int i=0 ; i<matrix.length ; i++)
        {
            for(int j=0 ; j<matrix[0].length ; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Here is your matrix");
        display(matrix);
        System.out.println("The largest number of the matrix is "+maximum(matrix));
        System.out.println("The smallest number of the matrix is "+minimum(matrix));
    }
}
