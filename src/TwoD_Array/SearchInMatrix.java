//java program to search an element in a sorted matrix
package TwoD_Array;

public class SearchInMatrix {
    public static Boolean mySearch(int [][]matrix , int key)
    {
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col>=0)
        {
            if(matrix[row][col]==key)
            {
                System.out.println("The element found at "+row+","+col);
                return true;
            }

            else if(key<matrix[row][col])
            {
                col--;
            }

            else
            {
                row++;
            }
        }
        System.out.println("Not found!!");
        return false;
    }
    public static void main(String[] args)
    {
        int [][]matrix = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;
        mySearch(matrix , key);
    }
}
