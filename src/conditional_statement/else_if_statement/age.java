//java program to check the person's life stage by taking the age
package conditional_statement.else_if_statement;
import java.util.Scanner;
public class age {
    public static void main(String[] agr)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int age = java.nextInt();

        if(age<13)
        {
            System.out.println("The person is in child stage");
        }
        else if(age>=13 && age<20)
        {
            System.out.println("The person is in teenager stage");
        }
        else
        {
            System.out.println("The person is in adult stage");
        }
    }
}
