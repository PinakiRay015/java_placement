//java program to perform searching in matrix
package TwoD_Array;

import java.util.Scanner;

public class search {
    public static void display(int [][]matrix)
    {
        for(int i=0 ; i<matrix.length ; i++)
        {
            for(int j=0 ; j<matrix[0].length ; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }
    }

    public static boolean mySearch(int [][]matrix , int key)
    {
        for(int i=0 ; i<matrix.length ; i++)
        {
            for(int j=0 ; j<matrix[0].length ; j++)
            {
                if(matrix[i][j] == key)
                {
                    System.out.printf("Element found at %d , %d" , i , j);
                    return true;
                }
            }
        }
        System.out.println("Element not found!!!");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]matrix = new int[3][3];

        System.out.println("Enter the data inside the matrix");
        for(int i = 0 ; i<matrix.length ; i++)
        {
            for(int j = 0 ; j<matrix[0].length ; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Here is your matrix");
        display(matrix);
        System.out.println("Enter the key to search");
        int key = sc.nextInt();
        mySearch(matrix , key);
    }
}
