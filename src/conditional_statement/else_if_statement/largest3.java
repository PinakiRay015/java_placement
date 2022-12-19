//java program to print the largest number among 3 numbers
package conditional_statement.else_if_statement;

import java.util.Scanner;

public class largest3 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println(a+" is largest among all");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is largest among all");
        }
        else
        {
            System.out.println(c+" is largest among all");
        }
    }
}
