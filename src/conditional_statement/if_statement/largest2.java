//java program to decide the largest number between two numbers
package conditional_statement.if_statement;
import java.util.Scanner;
public class largest2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a<b)
        {
            System.out.println(b+" is greater than "+a);
        }
        else
        {
            System.out.println(a+" is greater than "+b);
        }
    }
}
