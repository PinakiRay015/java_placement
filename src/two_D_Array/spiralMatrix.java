//java program to print the two-dimensional array in spiral order
package two_D_Array;

public class spiralMatrix {
    public static void spiralTraverse(int [][]matrix)
    {
        int startRow = 0;
        int startCol =  0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol<= endCol)
        {
            for(int j=startRow ; j<=endCol ; j++)
            {
                System.out.print(matrix[startRow][j]+" ");
            }
            for(int i=startRow+1 ; i<=endRow ; i++)
            {
                System.out.print(matrix[i][endRow]+" ");
            }
            for(int j=endCol-1 ; j>=startCol ; j--)
            {
                if(startRow == endRow)
                {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            for(int i=endRow-1 ; i>=startRow+1 ; i--)
            {
                if(startCol == endCol)
                {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String [] args)
    {
        int [][]matrix = {{1,2,3,4} ,
                          {5,6,7,8} ,
                          {9,10,11,12} ,
                          {13,14,15,16}};
        spiralTraverse(matrix);
    }
}
