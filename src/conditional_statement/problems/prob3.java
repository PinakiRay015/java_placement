//java program to built a simple calculator
package conditional_statement.problems;
import java.util.Scanner;
public class prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("1->Addition");
        System.out.println("2->Subtraction");
        System.out.println("3->Multiplication");
        System.out.println("4->Division");
        System.out.println("5->Modulus");

        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        System.out.println("\nEnter your choice");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1-> System.out.println("The addition is "+add);
            case 2-> System.out.println("The subtraction is "+sub);
            case 3-> System.out.println("The multiplication is "+mul);
            case 4-> System.out.println("The division is "+div);
            case 5-> System.out.println("The Remainder is "+mod);
            default -> System.out.println("Invalid choice");
        }

    }
}
