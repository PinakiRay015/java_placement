//java program to perform the transpose of the matrix
package TwoD_Array.problems;

public class transposeMatrix {
    public static int[][] transpose(int [][]matrix)
    {
        int row = matrix.length;
        int column = matrix[0].length;

        int [][]newMatrix = new int[column][row];

        for(int i=0 ; i<row ; i++)
        {
            for(int j=0 ; j<column ; j++)
            {
                newMatrix[j][i] = matrix[i][j];
            }
        }

        return newMatrix;
    }

    public static void display(int [][]matrix)
    {
        for(int i = 0 ; i<matrix.length ; i++)
        {
            for(int j=0 ; j<matrix[0].length ; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args)
    {
        int [][]matrix = {{1,2,3} , {4,5,6}};
        display(matrix);
        System.out.println("The transpose of the matrix is:👇");
        display(transpose(matrix));
    }
}
