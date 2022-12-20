//creating a method to add two add number
package functions_and_methods.basic_function;

import java.util.Scanner;

public class example2 {
    public static void addition()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = a+b;
        System.out.println("The addition of two numbers is "+add);
    }
    public static void main(String[] args) {
        addition();
    }
}
