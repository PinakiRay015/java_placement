package two_D_Array;

import java.util.Scanner;

public class sample1 {
    public static void main(String[] args) {
        int [][]matrix = new int[2][4];
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<matrix.length ; i++)
        {
            for(int j=0 ; j<matrix[0].length ; j++)
            {
                System.out.printf("matrix[%d][%d] : " , i , j);
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0 ; i<matrix.length ; i++)
        {
            for(int j=0 ; j<matrix[0].length ; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
