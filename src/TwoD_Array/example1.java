//java program to perform two dimensional array (matrix)
package TwoD_Array;

import java.util.Scanner;

public class example1 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int [][]matrix = new int[4][3];
        System.out.println("Enter the data in the matrix");
        for(int i = 0 ; i<matrix.length ; i++)
        {
            for(int j = 0 ; j<matrix[0].length ; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Here is the matrix");
        for(int i = 0 ; i<matrix.length ; i++)
        {
            for(int j = 0 ; j<matrix[0].length ; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }

            System.out.println("");
        }
    }
}
