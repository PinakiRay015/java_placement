//java program to calculate the income tax
package conditional_statement.problems;
import java.util.Scanner;
public class prob1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income");
        int income = sc.nextInt();
        float tax;
        if(income<500000)
        {
            System.out.println("Your have to give 0 tax");
        }
        else if(income>=500000 && income<1000000)
        {
            tax = (0.2f * income);
            System.out.println("you have to give "+tax);
        }
        else
        {
            tax = (0.3f * income);
            System.out.println("You have to give "+tax);
        }
    }
}
