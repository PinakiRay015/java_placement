//java program to find the area of the square

package variables_and_dataTypes;
import java.util.Scanner;
public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square");
        int side =  sc.nextInt();
        int area = side*side;
        System.out.println("The area of the square is "+area);
    }
}
