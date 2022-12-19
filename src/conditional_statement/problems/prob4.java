//java program to check whether a number a positive or negative;
package conditional_statement.problems;
import java.util.Scanner;
public class prob4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num>0)
        {
            System.out.println("This number is positive");
        }
        else
        {
            System.out.println("This number is negative");
        }
    }
}
