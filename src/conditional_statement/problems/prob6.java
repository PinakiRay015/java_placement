//java program to print the week day by taking the week number as an input from keyboard
package conditional_statement.problems;

import java.util.Scanner;

public class prob6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week number from 1-7");
        int week = sc.nextInt();

        switch (week)
        {
            case 1-> System.out.println("Sunday");
            case 2-> System.out.println("Monday");
            case 3-> System.out.println("Tuesday");
            case 4-> System.out.println("Wednesday");
            case 5-> System.out.println("Thursday");
            case 6->System.out.println("Friday");
            case 7->System.out.println("Saturday");
            default-> System.out.println("Invalid week number");
        }
    }
}
