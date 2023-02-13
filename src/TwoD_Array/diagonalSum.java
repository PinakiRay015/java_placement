//java program to perform diagonal sum in the matrix
package TwoD_Array;

public class diagonalSum {
    public static int myDiagonalSum(int [][]matrix)
    {
        int sum = 0;
        for(int i=0 ; i<matrix.length ; i++)
        {
            sum += matrix[i][i];
            if(i!=matrix.length-1-i)
            {
                sum+= matrix[i][matrix.length-1-i];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int [][]matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("The sum of the matrix is "+myDiagonalSum(matrix));
    }
}
