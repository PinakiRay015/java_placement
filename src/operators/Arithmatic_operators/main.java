package operators.Arithmatic_operators;
import java.util.Scanner;
public class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int addition = a+b;
        int subtraction = a-b;
        int multiplication = a*b;
        int division = a/b;
        int modulo = a%b;

        System.out.println("The addition is "+addition);
        System.out.println("The subtraction is "+subtraction);
        System.out.println("The multiplication is "+multiplication);
        System.out.println("The division is "+(float) division);
        System.out.println("The remainder is "+(float) modulo);

    }
}
