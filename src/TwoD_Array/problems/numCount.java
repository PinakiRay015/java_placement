//java program to add the digits of the second row of the given matrix
package TwoD_Array.problems;

public class numCount {
    public static int count(int [][]matrix)
    {
        int count = 0;
        for(int i=0 ; i<matrix[0].length ; i++)
        {
            count += matrix[1][i];
        }

        return count;
    }
    public static void main(String[] args) {
        int [][]matrix = {{1,4,9} , {11,4,3} , {2,2,3}};
        System.out.println(count(matrix));
    }
}
