//java program to find the sum of first and last digit of a number
package functions_and_methods.problems;

import java.util.Scanner;

public class firstAndLast {
    public static int sum(int num)
    {
        int lastDigit = num%10;
        while(num>=10)
        {
            num = num/10;
        }
        return num+lastDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = sc.nextInt();
        System.out.println("The sum of first and last digit of a number is "+sum(num));
    }
}
