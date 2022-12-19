package conditional_statement.problems;
import java.util.Scanner;
public class prob7 {
    public static void main(String[] args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = java.nextInt();

        if((year%4==0 && year%100!=0) || (year%400==0))
        {
            System.out.println("The year is leap year");
        }
        else
        {
            System.out.println("The year is not a leap year");
        }
    }
}
