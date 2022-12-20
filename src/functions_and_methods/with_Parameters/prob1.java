//creating a method to add two numbers BY PASSING PARAMETERS TO IT
package functions_and_methods.with_Parameters;

import java.util.Scanner;

public class prob1 {
    public static void addition(int num1 , int num2)
    {
        int sum = num1+num2;
        System.out.println("The addition of two numbers is "+sum);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers for addition");
        int a = sc.nextInt();
        int b = sc.nextInt();
        addition(a , b);
    }
}
