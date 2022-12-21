//java program to find the multiplication of two numbers
package functions_and_methods.problems;
import java.util.Scanner;
public class numMultiplication {
    public static int multiplication(int num1 , int num2)
    {
        int mul = num1*num2;
        return mul;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers for multiplication");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = multiplication(a , b);
        System.out.println("The multiplication of two numbers is "+m);
    }
}
