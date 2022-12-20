package functions_and_methods.return_type_function;
import java.util.Scanner;
public class prob1 {
    public static int multiplication(int num1 , int num2)
    {
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = multiplication(a,b);
        System.out.println("The sum of the two numbers is "+sum);
    }
}
